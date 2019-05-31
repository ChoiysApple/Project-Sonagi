

var map = new naver.maps.Map('map', {
    center: new naver.maps.LatLng(36.3595704, 126.105399),
    zoom: 10
});

var marker = new naver.maps.Marker({
    position: new naver.maps.LatLng(37.3595704, 127.105399),
    map: map
});