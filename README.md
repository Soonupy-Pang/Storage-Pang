<!DOCTYPE html>
<html lang="ko">
    <head>
    <title>Storage_Pang</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- favicon -->
        <link rel="apple-touch-icon" sizes="180x180" href="image/storage_pang logo.svg">
	<link rel="icon" type="image/png" sizes="96x96" href="image/storage_pang logo.svg">
	<link rel="icon" type="image/png" sizes="32x32" href="image/storage_pang logo.svg">
	<link rel="icon" type="image/png" sizes="16x16" href="image/storage_pang logo.svg">


    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.6.0/gsap.min.js"></script>

    <!-- Google Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;600;700;900&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;200;300;400;500;600;700&display=swap">
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/gh/orioncactus/pretendard/dist/web/static/pretendard.css" />

    <!-- Reset CSS and Custom Styles -->
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/index.css">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
	<link href="https://unpkg.com/css.gg/icons/icons.css" rel="stylesheet" />

<!-- favicon -->
<link rel="shortcut icon" href="/static/img/favicon.ico">

    <!-- Swiper CSS and JavaScript -->
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css">
    <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
	
    <!-- Your Custom JavaScript -->
    <script src="js/script.js"></script>
</head>
<body>
    <div id="wrap">
      <div class="logo">Stroage<img src="image/storage_pang logo.svg" alt="">Pang</div>
      <div class="container" id="container">
        <div class="form-container sign-up-container">
            <form action="#">
              <h1>Sign Up</h1>
              <span>소셜로 가입</span>
              <div class="social-container">
                <a href="#" class="social"><i class=""><img src="image/kakaotalk-logo.svg" alt=""></i></a>
                <a href="#" class="social"><i class="" style="width: 18px; filter:brightness(50%);"><img src="image/naver_logo.svg" alt=""></i></a>
                <a href="#" class="social"><i class="" style="width: 20px;"><img src="image/google_logo.svg" alt=""></i></a>
              </div>
              <span>계정으로 가입</span>
              <input type="email" placeholder="이메일" />
              <input type="password" placeholder="비밀번호" />
              <input type="password" placeholder="비밀번호 확인" />
              <button>회원가입</button>
            </form>
          </div>
          <div class="form-container sign-in-container">
            <form action="#">
              <h1>Sign In</h1>
              <span>소셜로 로그인</span>
              <div class="social-container">
                <a href="#" class="social"><i class=""><img src="image/kakaotalk-logo.svg" alt=""></i></a>
                <a href="#" class="social"><i class="" style="width: 18px; filter:brightness(50%);"><img src="image/naver_logo.svg" alt=""></i></a>
                <a href="#" class="social"><i class="" style="width: 20px;"><img src="image/google_logo.svg" alt=""></i></a>
              </div>
              <span>계정으로 로그인</span>
              <input type="email" placeholder="이메일" />
              <input type="password" placeholder="비밀번호"/>
              <!-- <a href="#">회원가입</a> -->
              <button>로그인</button>
            </form>
          </div>
          <div class="overlay-container">
            <div class="overlay">
              <div class="overlay-panel overlay-left">
                <h3>이미 회원이신가요?</h3>
                <p>지금 바로 지환이게 연락주세요.</p>
                <button class="ghost" id="signIn">Sign In</button>
              </div>
              <div class="overlay-panel overlay-right">
                <h3>회원이 아니신가요?</h3>
                <p>지환이를 가입하세요.</p>
                <button class="ghost" id="signUp">Sign Up</button>
              </div>
            </div>
          </div>
        </div>
    </div>
</body>
<style>
  #wrap{
    position: relative;
    /* overflow: visible; */
    .logo{
      display: flex;
      gap: 10px;
      align-items: center;
      position: absolute;
      top: -15%;
      left: 50%;
      transform: translate(-50%,50%);
      
      opacity: 0.75;
      z-index: 2;
      /* height: 200px; */
      animation: moveUpDown 2s ease-in-out infinite;

      img{
          /* width: 100%; */
          width: 60px;
          /* height: 100%; */
          /* object-fit: cover; */
      }
  }
  }
  
@keyframes moveUpDown {
  0%, 100% {
    transform: translate(-50%, 0); /* 기본 위치로 이동 */
}
50% {
    transform: translate(-50%, -50%); /* 10px 위로 이동한 후, 다시 원래 위치에서 10px 아래로 이동 */
}


}
  body {
    background: #f6f5f7;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    font-family: 'Montserrat', sans-serif;
    height: 100vh;
    margin: -20px 0 50px;
  }
  
  h3 {
    font-size: 1.25em;
    font-weight: bold;
    margin-bottom: 20px;
  }
  h1 {
    font-weight: bold;
    margin-bottom: 20px;
    color: #007bff;
  }
  
  h2 {
    text-align: center;
  }
  
  p {
    font-size: 14px;
    font-weight: 100;
    line-height: 20px;
    letter-spacing: 0.5px;
    margin: 20px 0 30px;
  }
  
  span {
    font-size: 12px;
  }
  
  a {
    color: #333;
    font-size: 14px;
    text-decoration: none;
    margin: 15px 0;
  }
  
  button {
    border-radius: 5px;
    border: 1px solid #007bff;
    background-color: #007bff;
    color: #FFFFFF;
    font-size: 12px;
    font-weight: bold;
    padding: 12px 45px;
    margin-top: 10px;
    letter-spacing: 1px;
    text-transform: uppercase;
    transition: transform 80ms ease-in;
    width: 100%;
  }
  
  button:active {
    transform: scale(0.95);
  }
  
  button:focus {
    outline: none;
  }
  
  button.ghost {
    background-color: transparent;
    border-color: #FFFFFF;
    border-radius: 20px;
        width: 50%;

        &:hover{
            background-color: #fff;
            color: #333;
        }
  }
  
  form {
    background-color: #FFFFFF;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    padding: 0 50px;
    height: 100%;
    text-align: center;
  }
  
  input {
    background-color: #eee;
    border: none;
    padding: 12px 15px;
    margin: 5px 0;
    width: 100%;
  }
  
  .container {
    background-color: #fff;
    border-radius: 10px;
      box-shadow: 0px 0px 20px rgba(0,0,0,0.25); 
        /* 0 10px 10px rgba(0,0,0,0.22); */
    position: relative;
    overflow: hidden;
    width: 768px;
    max-width: 100%;
    min-height: 480px;
  }
  
  .form-container {
    position: absolute;
    top: 0;
    height: 100%;
    transition: all 0.6s ease-in-out;
  }
  
  .sign-in-container {
    left: 0;
    width: 50%;
    z-index: 2;
  }
  
  .container.right-panel-active .sign-in-container {
    transform: translateX(100%);
  }
  
  .sign-up-container {
    left: 0;
    width: 50%;
    opacity: 0;
    z-index: 1;
  }
  
  .container.right-panel-active .sign-up-container {
    transform: translateX(100%);
    opacity: 1;
    z-index: 5;
    animation: show 0.6s;
  }
  
  @keyframes show {
    0%, 49.99% {
      opacity: 0;
      z-index: 1;
    }
    
    50%, 100% {
      opacity: 1;
      z-index: 5;
    }
  }
  
  .overlay-container {
    position: absolute;
    top: 0;
    left: 50%;
    width: 50%;
    height: 100%;
    overflow: hidden;
    transition: transform 0.6s ease-in-out;
    z-index: 100;
  }
  
  .container.right-panel-active .overlay-container{
    transform: translateX(-100%);
  }
  
  .overlay {
    background: #FF416C;
    /* background: -webkit-linear-gradient(to right, #FF4B2B); */
    /* background: linear-gradient(to right, #FF4B2B); */
    background-color: #333;
    background-repeat: no-repeat;
    background-size: cover;
    background-position: 0 0;
    color: #FFFFFF;
    position: relative;
    left: -100%;
    height: 100%;
    width: 200%;
      transform: translateX(0);
    transition: transform 0.6s ease-in-out;
  }
  
  .container.right-panel-active .overlay {
      transform: translateX(50%);
  }
  
  .overlay-panel {
    position: absolute;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    padding: 0 40px;
    text-align: center;
    top: 0;
    height: 100%;
    width: 50%;
    transform: translateX(0);
    transition: transform 0.6s ease-in-out;
  }
  
  .overlay-left {
    transform: translateX(-20%);
  }
  
  .container.right-panel-active .overlay-left {
    transform: translateX(0);
  }
  
  .overlay-right {
    right: 0;
    transform: translateX(0);
  }
  
  .container.right-panel-active .overlay-right {
    transform: translateX(20%);
  }
  
  .social-container {
    margin-block: 5px 20px;
  }
  
  .social-container a {
    border: 1px solid #DDDDDD;
    border-radius: 50%;
    display: inline-flex;
    justify-content: center;
    align-items: center;
    margin: 0 5px;
    height: 40px;
    width: 40px;
    filter: grayscale(100%);
    

    &:hover{
      filter: none !important;

      i{
        filter: none !important;
      }
    }

    i{
        width: 24px;
    }
  }
  
  footer {
      background-color: #222;
      color: #fff;
      font-size: 14px;
      bottom: 0;
      position: fixed;
      left: 0;
      right: 0;
      text-align: center;
      z-index: 999;
  }
  
  footer p {
      margin: 10px 0;
  }
  
  footer i {
      color: red;
  }
  
  footer a {
      color: #3c97bf;
      text-decoration: none;
  }
</style>
<script>
    $(document).ready(function() {
    $('#signUp').click(function() {
        $('#container').addClass('right-panel-active');
    });

    $('#signIn').click(function() {
        $('#container').removeClass('right-panel-active');
    });
});;
</script>
</html>
