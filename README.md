# 使用maven管理项目各个模块

对现在已有maven-SSH项目进行拆分，**拆分思路**：将dao层的代码已经配置文件全体提取出来到一个表现上独立的工程中。同样service、action拆分。我实在在我的这个[练习项目](https://github.com/coderlongren/mavenSSH-wirk-)基础上拆分的 .
* ssh-parent: 父工程
* ssh-dao:（子模块）
* ssh-service
* ssh-web

## 1 创建父工程
1. 项目需要的依赖的信息，在父工程中定义，子模块继承过程
2. 将各个子模块聚合到一起
## 2 将spring的配置文件拆分
### dao
* applicationContext-basic.xml
* applicationContext-dao.xml
### service
* applicationContext-service.xml

### web
* applicationContext-action.xml
* struts.xml

下面这张图是maven依赖关系图
![](/test.png)




