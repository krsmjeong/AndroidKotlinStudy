package com.jessprac.toiletofseoul

import android.content.Context
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.clustering.ClusterManager
import com.google.maps.android.clustering.view.DefaultClusterRenderer

// ClusterRenderer 클래스는 마커를 랜더링하는 작업을 담당하는 클래스
class ClusterRenderer(context: Context?, map: GoogleMap?, clusterManager: ClusterManager<MyItem>?) :
DefaultClusterRenderer<MyItem>(context, map, clusterManager) {

    init {
        // 전달받은 clusterManager 객체에 renderer 를 자신으로 지정
        clusterManager?.renderer = this
    }

    override fun onBeforeClusterItemRendered(item: MyItem?, markerOptions: MarkerOptions?) {

        // 마커의 아이콘 지정
        markerOptions?.icon(item?.getIcon())
        markerOptions?.visible(true)
        }
    }