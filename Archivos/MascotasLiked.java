<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.barto.petagramweek3.MascotasLiked">

    <include android:id="@+id/miActionBar"
        layout="@layout/actionbar"></include>

    <TextView
        android:id="@+id/TituloDetalleLike"
        android:layout_below="@id/miActionBar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Mascotas Liked"
        android:textSize="20sp"
        android:padding="7dp"
        android:textStyle="bold"
        android:layout_centerHorizontal="true"
        />
    <android.support.v7.widget.RecyclerView
        android:id="@+id/rvMascotasLike"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_centerHorizontal="true"
        android:padding="@dimen/activity_horizontal_margin"
        android:layout_below="@+id/TituloDetalleLike"
        >
    </android.support.v7.widget.RecyclerView>


</RelativeLayout>
