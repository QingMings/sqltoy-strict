# 演示严格分DTO(VO)和POJO(Entity) 的项目实现过程
## 1. 通过tools/quickvo 工具

* 区别在于quickvo.xml的配置,额外增加了entity实体对象生成

```xml
<tasks dist="../../src/main/java" encoding="UTF-8">
		<task active="true" author="zhongxuchen" include="^SAG_\w+" datasource="quickstart" swagger-model="true">
			<entity package="${project.package}.sagacity.entity" substr="Sag" name="#{subName}"/>
			<vo package="${project.package}.sagacity.vo" substr="Sag" name="#{subName}VO" />
		</task>
		<task active="true" author="zhongxuchen" include="^SYS_\w+" datasource="quickstart" swagger-model="true">
			<entity package="${project.package}.system.entity" substr="Sys" name="#{subName}"/>
			<vo package="${project.package}.system.vo" substr="Sys" name="#{subName}VO" />
		</task>
</tasks>
```

## 2. 数据初始化
* 在mysql中创建strict数据库，并配置src/main/resoruces下面的application.properties
* 执行src/main/resources/mock/strict_init.sql 完成表结构和数据初始化

## 3. 阅读src/main/java下面com.strict.modules.sagacity 和 system模块下面的代码

## 4. 通过启动StrictApplication进行swagger演示
* 访问:http://localhost:8080/swagger-ui/ 
* 可以完成字典分类的维护和唯一性验证，参见:DictTypeController

# 规则说明
## sqltoy常规情况下通过SqlToyLazyDao来避免开发者写转接式的dao
* 转接式的Dao就是本质可以通过统一的dao来完成的，为了保持service、dao这种结构形态，刻意写出一个dao然后其中不包含任何的附加逻辑只做一个转调
## sqltoy强调通用但不回避意外，坚决不搞极端主义，所以sqltoy推荐针对部分场景开发者可以提供dao，但不建议mybatis模式的接口式的dao(纯接口能干的用lazyDao,不能干的就需要给开发者自行实现)
