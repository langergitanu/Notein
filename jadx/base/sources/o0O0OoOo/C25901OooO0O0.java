package o0O0OoOo;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0O0OoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25901OooO0O0 extends TouchDelegate {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f88430OooO00o;

    public C25901OooO0O0(ViewGroup viewGroup) {
        super(new Rect(), viewGroup);
        this.f88430OooO00o = new LinkedHashMap();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        Iterator it = this.f88430OooO00o.values().iterator();
        while (it.hasNext()) {
            if (((TouchDelegate) it.next()).onTouchEvent(event)) {
                return true;
            }
        }
        return false;
    }
}
