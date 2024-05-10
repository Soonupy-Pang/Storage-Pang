<h1>스누피와 지팡이의 첫 번째 프로젝트</h1>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Storage_Pang</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.6.0/gsap.min.js"></script>

    <!-- Google Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;600;700;900&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;200;300;400;500;600;700&display=swap">
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/gh/orioncactus/pretendard/dist/web/static/pretendard.css" />

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
    <link href="https://unpkg.com/css.gg/icons/icons.css" rel="stylesheet" />

    <!-- Swiper CSS and JavaScript -->
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css">
    <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>

    <!-- Your Custom JavaScript -->
    <script src="js/script.js"></script>
</head>
<body style="background: #f6f5f7; display: flex; justify-content: center; align-items: center; flex-direction: column; font-family: 'Montserrat', sans-serif; height: 100vh; margin: -20px 0 50px;">
    <div id="wrap" style="position: relative;">
        <div class="logo" style="display: flex; gap: 10px; align-items: center; position: absolute; top: -15%; left: 50%; transform: translate(-50%,50%); opacity: 0.75; z-index: 2; animation: moveUpDown 2s ease-in-out infinite;">
            Storage<img src="image/storage_pang logo.svg" alt="" style="width: 60px;">Pang
        </div>
        <div class="container" id="container" style="background-color: #fff; border-radius: 10px; box-shadow: 0px 0px 20px rgba(0,0,0,0.25); position: relative; overflow: hidden; width: 768px; max-width: 100%; min-height: 480px;">
            <!-- Content elements with inline styles go here -->
        </div>
    </div>
</body>
</html>
