package o0o00o0O;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import o0o00Oo.InterfaceC29896OooO0OO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o0o00o0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC29946OooO0O0 implements InterfaceC29896OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32447OooOOo f106333OooO00o;

    public AbstractC29946OooO0O0(final Context context, final int i, final int i2, final int i3) {
        this.f106333OooO00o = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o00o0O.OooO00o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                this.f106329OooOo0o.getClass();
                PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(context).inflate(i, (ViewGroup) null), i2, i3, true);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setElevation(10.0f);
                return popupWindow;
            }
        });
    }

    public final C32443OooOOO OooO0O0(int i, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        View contentView = OooO0OO().getContentView();
        int width = OooO0OO().getWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
        int height = OooO0OO().getHeight();
        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
        switch (i) {
            case 0:
            case 1:
            case 2:
                return new C32443OooOOO(Integer.valueOf(rect.left), Integer.valueOf(rect.bottom));
            case 3:
                return new C32443OooOOO(Integer.valueOf(rect.left - contentView.getMeasuredWidth()), Integer.valueOf(rect.top));
            case 4:
            case 5:
            case 6:
                return new C32443OooOOO(Integer.valueOf(rect.left), Integer.valueOf(rect.top - contentView.getMeasuredHeight()));
            case 7:
                return new C32443OooOOO(Integer.valueOf(rect.right), Integer.valueOf(rect.top));
            default:
                return new C32443OooOOO(Integer.valueOf(rect.left), Integer.valueOf(rect.top - contentView.getMeasuredHeight()));
        }
    }

    public final PopupWindow OooO0OO() {
        return (PopupWindow) this.f106333OooO00o.getValue();
    }
}
