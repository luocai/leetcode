博客设计：
表：文章表（id,title,content,time,type(分类)，clickN） 用户表(id,username,password,role，ip，昵称）
评论表(id,content,who,time,artile（哪篇文章下面的评论）),分类表(id,typename) 

实现功能
1.登进去看到文章列表，每篇博客显示标题和概要以及图片
2.普通用户：查看文章，评论（需要登录），点赞，踩（...），搜索文章（按关键字，按）
3.博主:写文章，回复评论，管理文章（增删改查）


4.24号疑问
解决后台删除文章当某一页最后一个数据后页面空白的情况

4.26日需求
分类管理
4.27需求
博文搜索的时候不分已发布和未发布

4.29日需求
当评论已经回复后，链接不可用
评论按时间排列
