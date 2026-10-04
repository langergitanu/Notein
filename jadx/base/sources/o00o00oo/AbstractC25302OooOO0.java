package o00o00oo;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.fragment.app.C21929Ooooo0o;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o00o00oO.C25292OooO0oo;
import o00o00oO.InterfaceC25288OooO0Oo;

/* JADX INFO: renamed from: o00o00oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class AbstractC25302OooOO0<T extends View, Z> extends AbstractC25294OooO00o<Z> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f86111OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f86112OooOo0o;

    /* JADX INFO: renamed from: o00o00oo.OooOO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static Integer f86113OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f86114OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f86115OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC19692OooO00o f86116OooO0OO;

        /* JADX INFO: renamed from: o00o00oo.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC19692OooO00o implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final WeakReference<OooO00o> f86117OooOo0o;

            public ViewTreeObserverOnPreDrawListenerC19692OooO00o(OooO00o oooO00o) {
                this.f86117OooOo0o = new WeakReference<>(oooO00o);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                OooO00o oooO00o = this.f86117OooOo0o.get();
                if (oooO00o == null) {
                    return true;
                }
                ArrayList arrayList = oooO00o.f86115OooO0O0;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = oooO00o.f86114OooO00o;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int iOooO00o = oooO00o.OooO00o(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                int iOooO00o2 = oooO00o.OooO00o(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iOooO00o <= 0 && iOooO00o != Integer.MIN_VALUE) {
                    return true;
                }
                if (iOooO00o2 <= 0 && iOooO00o2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((InterfaceC25301OooO0oo) it.next()).OooO0O0(iOooO00o, iOooO00o2);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(oooO00o.f86116OooO0OO);
                }
                oooO00o.f86116OooO0OO = null;
                arrayList.clear();
                return true;
            }
        }

        public OooO00o(ImageView imageView) {
            this.f86114OooO00o = imageView;
        }

        public final int OooO00o(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            ImageView imageView = this.f86114OooO00o;
            if (imageView.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = imageView.getContext();
            if (f86113OooO0Oo == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C21929Ooooo0o.OooO0OO(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f86113OooO0Oo = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f86113OooO0Oo.intValue();
        }
    }

    public AbstractC25302OooOO0(ImageView imageView) {
        C21929Ooooo0o.OooO0OO(imageView, "Argument must not be null");
        this.f86112OooOo0o = imageView;
        this.f86111OooOo = new OooO00o(imageView);
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final InterfaceC25288OooO0Oo getRequest() {
        Object tag = this.f86112OooOo0o.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC25288OooO0Oo) {
            return (InterfaceC25288OooO0Oo) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void getSize(InterfaceC25301OooO0oo interfaceC25301OooO0oo) throws Throwable {
        OooO00o oooO00o = this.f86111OooOo;
        ImageView imageView = oooO00o.f86114OooO00o;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iOooO00o = oooO00o.OooO00o(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = oooO00o.f86114OooO00o;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iOooO00o2 = oooO00o.OooO00o(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iOooO00o > 0 || iOooO00o == Integer.MIN_VALUE) && (iOooO00o2 > 0 || iOooO00o2 == Integer.MIN_VALUE)) {
            ((C25292OooO0oo) interfaceC25301OooO0oo).OooO0O0(iOooO00o, iOooO00o2);
            return;
        }
        ArrayList arrayList = oooO00o.f86115OooO0O0;
        if (!arrayList.contains(interfaceC25301OooO0oo)) {
            arrayList.add(interfaceC25301OooO0oo);
        }
        if (oooO00o.f86116OooO0OO == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            OooO00o.ViewTreeObserverOnPreDrawListenerC19692OooO00o viewTreeObserverOnPreDrawListenerC19692OooO00o = new OooO00o.ViewTreeObserverOnPreDrawListenerC19692OooO00o(oooO00o);
            oooO00o.f86116OooO0OO = viewTreeObserverOnPreDrawListenerC19692OooO00o;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC19692OooO00o);
        }
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public void onLoadCleared(Drawable drawable) {
        OooO00o oooO00o = this.f86111OooOo;
        ViewTreeObserver viewTreeObserver = oooO00o.f86114OooO00o.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(oooO00o.f86116OooO0OO);
        }
        oooO00o.f86116OooO0OO = null;
        oooO00o.f86115OooO0O0.clear();
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void removeCallback(InterfaceC25301OooO0oo interfaceC25301OooO0oo) {
        this.f86111OooOo.f86115OooO0O0.remove(interfaceC25301OooO0oo);
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void setRequest(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        this.f86112OooOo0o.setTag(R.id.glide_custom_view_target_tag, interfaceC25288OooO0Oo);
    }

    public final String toString() {
        return "Target for: " + this.f86112OooOo0o;
    }
}
