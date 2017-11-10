<body>
<!--********************************33333333**********************************-->
<div class="xs-col-12 main">
    <!--********************************4444444***********************************-->
    <div class="infoBlock text-color
    col-xs-2">
        <ol><a href="#Sesson_1">
            <h2>Cossacks</h2></a>
            <c:forEach items="${URLInfo}" var="ListURL">
                <li>
                    <a href="#${ListURL.nameOfVideo}">
                        <p>${ListURL.nameOfVideo}</p>
                    </a>
                </li>
            </c:forEach>
        </ol>
    </div>

    <!--********************************5555555*************************-->
    <div class="videoplayer text-color
col-xs-9">
        <div class="namesSessons ">Cossacks</div>

        <c:forEach items="${URLInfo}" var="ListURL">

            <div class="oneVideoBlock col-xs-6" name="${ListURL.nameOfVideo}">
                <div class="" >
                    <iframe src="https://www.youtube-nocookie.com/embed/${ListURL.url}?rel=controls=0&amp;showinfo=0" ;
                            controls=0&amp; showinfo=0" frameborder="0" allowfullscreen
                            class="video blockOfvideoAndInfo" >
                    </iframe>
                </div>
                <div class="info blockOfvideoAndInfo ">
                        ${ListURL.nameOfVideo}
                    <div></div>
                        ${ListURL.textForVideo}
                </div>
            </div>
        </c:forEach>
    </div>
</div>


</div>
</body>