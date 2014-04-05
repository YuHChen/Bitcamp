package com.example.bitcamp;

import android.content.Context;
import android.widget.ImageView;

import com.android.angle.AngleCircleCollider;
import com.android.angle.AnglePhysicObject;
import com.android.angle.AngleVector;

public class ImageBall extends ImageView {

	private AnglePhysicObject mBall;

	public ImageBall(Context context, float x, float y) {
		super(context);
		mBall = new AnglePhysicObject(0, 1);
		mBall.mPosition = new AngleVector(x, y);
		AngleCircleCollider ballCollider = new AngleCircleCollider(x, y, 5f);
		mBall.addCircleCollider(ballCollider);
		mBall.mMass = 1;
		mBall.mVelocity = new AngleVector(0, 1f);
		mBall.mDelta = new AngleVector(1f, 1f);
	}

	public ImageBall(Context context) {
		this(context, 0, 0);
	}

	public AnglePhysicObject getBall() {
		return mBall;
	}

	public int setBall(AnglePhysicObject ball) {
		mBall = ball;
		return 0;
	}

}