import android.view.View;
import android.widget.ImageView;
import android.angle.AnglePhysicObject;
import android.angle.AngleCircleCollider;

public class ImageBall extends ImageView {
    
    public ImageBall(Context context, float x, float y){
	super(context);
	AnglePhysicObject ball = new AnglePhysicObject(0,1);
	ball.mPosition = new AngleVector(x,y);
	AngleCircleCollider ballCollider = new AngleCircleCollider(x,y,5f);
	ball.addCircleCollider(ballCollider);
    }

    public ImageBall(Context context){
	this(context,0,0);
    }
}