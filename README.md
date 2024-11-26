<div align="left">

[简体中文](README-zh.md) | [English](README.md)
</div>

## What is it?
Archetype when creating the sermant project.

## How to use it?
Refer to official website guidance: https://sermant.io/zh/document/developer-guide.

The quick development and usage guide for implementing service governance plugins under the Sermant framework can be found at https://bbs.huaweicloud.com/blogs/415083.

## How to deploy first-plugin archetype using github action?
### 1. Modify archetype version
Modify archetype.properties file:
```properties
archetype.groupId=io.sermant
archetype.artifactId=sermant-template-archetype
archetype.version=2.1.0 # modify this version before deploy
package=io.sermant
excludePatterns=.github/**,.idea/**,.idea/libraries/*,**/*.iml,README.md,README-zh.md
```

### 2. Modify project version
Modify all pom file of this project:
```
<version>2.1.0</version> # modify this version in pom file before release
```

### 3. Modify config

Update the configuration files under the config/ directory.

### 4. Create new version branch and push tag

Create new version branch, and push version tag:
```shell
git tag vx.x.x
git push origin vx.x.x
```
> Note: origin is git@github.com:sermant-io/first-plugin.git
