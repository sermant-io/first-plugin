<div align="left">

[简体中文](README-zh.md) | [English](README.md)
</div>

## first-plugin
创建sermant项目的原型.

## 如何使用?
官网指导: https://sermant.io/zh/document/developer-guide.

基于Sermant框架开发服务治理插件的使用指导： https://bbs.huaweicloud.com/blogs/415083.

## 如何使用github action自动发布first-plugin原型?
### 1. 修改原型版本
Modify archetype.properties file:
```properties
archetype.groupId=io.sermant
archetype.artifactId=sermant-template-archetype
archetype.version=2.1.0 # 发布前修改该版本
package=io.sermant
excludePatterns=.github/**,.idea/**,.idea/libraries/*,**/*.iml,README.md,README-zh.md
```

### 2. 修改项目版本
修改该项目下的所有POM文件:
```
<version>2.1.0</version> # 发布前修改POM文件的版本
```

### 3. 修改配置
更新config/目录下的配置文件

### 4. 创建新的版本分支并推送标签

创建新的版本分支, 并在该分支推送版本标签:
```shell
git tag vx.x.x
git push origin vx.x.x
```
> 注意: origin是git@github.com:sermant-io/first-plugin.git
