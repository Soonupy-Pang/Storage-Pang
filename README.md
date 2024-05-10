<h1>스누피와 지팡이의 첫 번째 프로젝트</h1>
<div class="logo">Stroage<img src="image/storage_pang logo.svg" alt="">Pang</div>
<style>
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
  
@keyframes moveUpDown {
  0%, 100% {
    transform: translate(-50%, 0); /* 기본 위치로 이동 */
}
50% {
    transform: translate(-50%, -50%); /* 10px 위로 이동한 후, 다시 원래 위치에서 10px 아래로 이동 */
}
</style>
