package com.jessprac.toiletofseoul

import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.clustering.ClusterItem

// ClusterItem 을 구현하는 클래스.
// getSnippet(), getTitle(), getPosition() 함수흫 구현해야함.
// 생성자에서 전달받은 데이터를 반환할수 있게 구현
// 멤버 프로퍼티는 인터페이스 Getter 와 이름이 다르게 지정
// 마커의 아이콘을 변경하기 위해 icon 파라미터를 추가로 받음

class MyItem(val _position: LatLng, val _title: String, val _snippet: String, val _icon: BitmapDescriptor) :ClusterItem {
    override fun getPosition(): LatLng {
        return _position
    }

    override fun getTitle(): String {
        return _title
    }

    override fun getSnippet(): String {
        return _snippet
    }

    fun getIcon(): BitmapDescriptor {
        return _icon
    }

    override fun equals(other: Any?): Boolean {
        if (other is MyItem) {
            return (other.position.latitude == position.latitude
                    && other.position.longitude == position.longitude
                    && other.title == _title
                    && other.snippet == _snippet
                    )
        }
        return false
    }

    override fun hashCode(): Int {
        var hash = _position.latitude.hashCode() * 31
        hash = hash * 31 + _position.longitude.hashCode()
        hash = hash * 31 + title.hashCode()
        hash = hash * 31 + snippet.hashCode()
        return hash
    }

}