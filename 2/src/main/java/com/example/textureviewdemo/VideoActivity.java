package com.example.textureviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VideoActivity extends Activity {

	RecyclerView rlVideoList;
	List<String> videos=new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		rlVideoList=(RecyclerView) findViewById(R.id.rv_vieo_list);
		LinearLayoutManager layoutManager=new LinearLayoutManager(VideoActivity.this);
		layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
		rlVideoList.setLayoutManager(layoutManager);
		
		/**故意报错**/

		/**故意报错**/
		videos.add("http://wvideo.spriteapp.cn/video/2016/1122/150454e0-b0be-11e6-b5fe-d4ae5296039d_wpd.mp4 ");
		videos.add("http://wvideo.spriteapp.cn/video/2016/1122/150454e0-b0be-11e6-b5fe-d4ae5296039d_wpd.mp4 ");
		videos.add("http://wvideo.spriteapp.cn/video/2016/1122/150454e0-b0be-11e6-b5fe-d4ae5296039d_wpd.mp4 ");
		videos.add("http://wvideo.spriteapp.cn/video/2016/1122/150454e0-b0be-11e6-b5fe-d4ae5296039d_wpd.mp4 ");
		videos.add("http://wvideo.spriteapp.cn/video/2016/1122/150454e0-b0be-11e6-b5fe-d4ae5296039d_wpd.mp4 ");
		videos.add("http://wvideo.spriteapp.cn/video/2016/1122/150454e0-b0be-11e6-b5fe-d4ae5296039d_wpd.mp4 ");
		VideoAdapter adapter=new VideoAdapter(VideoActivity.this, videos);
		rlVideoList.setAdapter(adapter);
	}
}
