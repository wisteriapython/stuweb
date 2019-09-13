<%--
  Created by IntelliJ IDEA.
  User: 预见
  Date: 2018-11-21
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>国内新闻</title>
</head>
<link rel="stylesheet" href="css/news.css" type="text/css">
<body>
<div id="container">
    <!--顶部导航-->
    <div class="bgwidth bg1">
        <div class="nav1 center">
            <div class="nav1_div1">
                <ul>
                    <li class="first"><a href="#">新浪首页</a></li>
                    <li><a href="#">新闻</a></li>
                    <li><a href="#">体育</a></li>
                    <li><a href="#">财经</a></li>
                    <li><a href="#">娱乐</a></li>
                    <li><a href="#">科技</a></li>
                    <li><a href="#">博客</a></li>
                    <li><a href="#">图片</a></li>
                    <li><a href="#">专栏</a></li>
                    <li class="nav1_last"><a href="#" >更多
                        <div>
                            <ul>
                                <li>汽车</li>
                                <li>教育</li>
                            </ul>
                        </div></a>
                    </li>
                </ul>
            </div>
            <div class="nav1_div2">
                <ul>
                    <li class="login">
                        <div class="login_div1">
                            <img src="image/thumb_default.png" alt=""><a href="#">登录
                        </a>
                        </div>
                        <div class="login_div2">登录。。。。</div>
                    </li>
                    <li><a href="#">注册</a></li>
                    <li><a href="#">移动客户端</a></li>
                </ul>
            </div>
        </div>
    </div>

    <!--广告-->
    <div class="nav2 center"><img src="image/banner.jpg" alt=""></div>
    <div class="nav3 center">
        <div class="nav3_div1">
            <img src="../image/sinalogo.png" alt="">
            <span>新闻中心</span>
        </div>
        <div class="nav3_div2">
            <a href="#">新闻</a>
            <input type="text" placeholder="请输入关键字">
            <button class="nav3_div2_search"></button>
        </div>
    </div>

    <div class="clear"></div>
    <div class="bgwidth bgc1">
        <div class="center nav4">
            <ul>
                <li><a href="#">首页</a></li>
                <li><a href="#" class="one">国内</a></li>
                <li><a href="#">国际</a></li>
                <li><a href="#">辟谣</a></li>
                <li><a href="#">军事</a></li>
                <li><a href="#">视频</a></li>
                <li><a href="#">文化</a></li>
                <li><a href="#">VR视频</a></li>
                <li><a href="#">图片</a></li>
            </ul>
        </div>
    </div>

    <!--新闻内容-->
    <div class="nav5 center ">

        <div class="nav5_pic_news">
            <div class="bignews"><img src="image/w500h333l80af5.jpg" alt="">
                <span>西安泥灌车与面包车相撞已至10人死亡</span>
            </div>
            <div class="detialnews">
                <ul class="nav5_listnews">
                    <li><div class="dnews_item"><img src="image/269855519.jpg" alt=""><div>神操作！看大学生如何用意念控制翻书</div><i class="playicon"></i></div></li>
                    <li><div class="dnews_item"><img src="image/269864136.jpg" alt=""><div>李克强中英双语“打广告”：中国欢迎更多新加坡投资</div><i class="playicon"></i></div></li>
                    <li><div class="dnews_item"><img src="image/269869534.jpg" alt=""><div>李克强妙解“新加坡” 赢得现场热烈掌声</div><i class="playicon"></i></div></li>
                    <li><div class="dnews_item"><img src="image/269885877.jpg" alt=""><div>新闻联播视频-商务部：全力支持民营经济发展</div><i class="playicon"></i></div></li>
                </ul>
            </div>
        </div>
        <div class="nav5_list_news">
            <div class="nav5_new_div1">
                <ul>
                    <li><a href="#">应新加坡商界领袖请求：李克强晚宴致辞不用讲稿</a></li>
                    <li><a href="#">这几天 这个国家举国上下都在感谢中国</a></li>
                    <li><a href="#">军队停偿“下篇文章”落笔 招待所“打头阵”</a></li>
                    <li><a href="#">鲁炜忏悔书在这场展览曝光:妻子对我完全绝望(图)</a></li>
                </ul>
            </div>
            <div class="nav5_new_div2">
                <ul>
                    <li><a href="#">官员为应付中央扫黑除恶督导编造记录 被当场发现</a></li>
                    <li><a href="#">副局长晚间洗澡未接巡视组电话被处分 纪委回应</a></li>
                    <li><a href="#">10月70城房价出炉 这些城市的房价降了</a></li>
                    <li><a href="#">韩国名校被中国网友举报：将西藏与印度并列(图)</a></li>
                    <li><a href="#">医院雇没病老人骗医保 官方:责令2家医院停业整顿</a></li>
                    <li><a href="#">发改委:未研究或提出“汽车购置税减半至5%”建议</a></li>
                    <li><a href="#">国新办发表《新疆的文化保护与发展》白皮书</a></li>
                    <li><a href="#">中央深改委会议 通过了五个支持海南的重要方案</a></li>
                    <li><a href="#">江苏副省长缪瑞林落马 曾任南京市长与杨卫泽搭档</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="codediv">fixed</div>
</body>
</html>