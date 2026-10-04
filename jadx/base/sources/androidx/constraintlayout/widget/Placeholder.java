package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f64165OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f64166OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f64167OooOoO0;

    public View getContent() {
        return this.f64165OooOo;
    }

    public int getEmptyVisibility() {
        return this.f64167OooOoO0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(MsalUtils.QUERY_STRING_SYMBOL, 0, 1, rect);
            canvas.drawText(MsalUtils.QUERY_STRING_SYMBOL, ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f64166OooOo0o == i) {
            return;
        }
        View view = this.f64165OooOo;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.OooO00o) this.f64165OooOo.getLayoutParams()).f63932OooooOo = false;
            this.f64165OooOo = null;
        }
        this.f64166OooOo0o = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f64167OooOoO0 = i;
    }
}
