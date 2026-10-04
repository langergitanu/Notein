package o0Ooo000;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import o000O0oO.C24412OooO0oO;
import o000oo0.C24659OooO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32447OooOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo000.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29363Oooo0O0 extends RecyclerView.C22074OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C29337OooOO0 f104124OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32447OooOOo f104125OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Boolean f104128OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C32447OooOOo f104130OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public RunnableC29359Oooo0 f104131OooO0oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f104126OooO0OO = C20519OooO0Oo.OooO0OO(new C24659OooO0o(this, 1));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C32443OooOOO<Float, Float> f104127OooO0Oo = new C32443OooOOO<>(Float.valueOf(-1.0f), Float.valueOf(-1.0f));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f104129OooO0o0 = true;

    public C29363Oooo0O0(Context context, C29337OooOO0 c29337OooOO0) {
        this.f104124OooO00o = c29337OooOO0;
        this.f104125OooO0O0 = C20519OooO0Oo.OooO0OO(new C24412OooO0oO(context, 2));
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C29362Oooo00o(0));
        this.f104130OooO0oO = c32447OooOOoOooO0OO;
        String str = "touchSlop: " + OooO0O0() + ", longClickTimeout: " + ((Number) c32447OooOOoOooO0OO.getValue()).longValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteTreeSelection");
        c20358OooO00o.OooO0o0(str, new Object[0]);
    }

    public final float OooO0O0() {
        return ((Number) this.f104126OooO0OO.getValue()).floatValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
    public final boolean OooO0OO(RecyclerView recyclerView, MotionEvent motionEvent) throws Exception {
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int action = motionEvent.getAction();
            View view = null;
            if (action == 0) {
                this.f104129OooO0o0 = true;
                this.f104128OooO0o = null;
                C32443OooOOO<Float, Float> c32443OooOOO = this.f104127OooO0Oo;
                Float fValueOf = Float.valueOf(motionEvent.getRawX());
                Float fValueOf2 = Float.valueOf(motionEvent.getRawY());
                c32443OooOOO.getClass();
                this.f104127OooO0Oo = new C32443OooOOO<>(fValueOf, fValueOf2);
                System.currentTimeMillis();
                Iterator<View> it = ViewGroupKt.getChildren(recyclerView).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View next = it.next();
                    if (C29360Oooo000.OooO00o(next, motionEvent)) {
                        view = next;
                        break;
                    }
                }
                View view2 = view;
                if (view2 != null) {
                    RunnableC29359Oooo0 runnableC29359Oooo0 = new RunnableC29359Oooo0(this, view2, layoutManager.getPosition(view2));
                    this.f104131OooO0oo = runnableC29359Oooo0;
                    recyclerView.postDelayed(runnableC29359Oooo0, ((Number) this.f104130OooO0oO.getValue()).longValue());
                }
            } else if (action != 1) {
                C32443OooOOO<Float, Float> c32443OooOOO2 = this.f104127OooO0Oo;
                float fFloatValue = c32443OooOOO2.f116638OooOo0o.floatValue();
                float fFloatValue2 = c32443OooOOO2.f116637OooOo.floatValue();
                if (fFloatValue >= 0.0f && fFloatValue2 >= 0.0f && (Math.abs(motionEvent.getRawY() - fFloatValue2) > OooO0O0() || Math.abs(motionEvent.getRawX() - fFloatValue) > OooO0O0())) {
                    this.f104129OooO0o0 = false;
                    recyclerView.removeCallbacks(this.f104131OooO0oo);
                    return false;
                }
            } else if (this.f104129OooO0o0) {
                C32443OooOOO<Float, Float> c32443OooOOO3 = this.f104127OooO0Oo;
                float fFloatValue3 = c32443OooOOO3.f116638OooOo0o.floatValue();
                float fFloatValue4 = c32443OooOOO3.f116637OooOo.floatValue();
                if (Math.abs(fFloatValue3 - motionEvent.getRawX()) < OooO0O0() && Math.abs(fFloatValue4 - motionEvent.getRawY()) < OooO0O0()) {
                    Iterator<View> it2 = ViewGroupKt.getChildren(recyclerView).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        View next2 = it2.next();
                        if (C29360Oooo000.OooO00o(next2, motionEvent)) {
                            view = next2;
                            break;
                        }
                    }
                    View view3 = view;
                    if (view3 != null) {
                        int position = layoutManager.getPosition(view3);
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104128OooO0o, Boolean.FALSE)) {
                            this.f104124OooO00o.invoke(new C32443OooOOO(view3, Integer.valueOf(position)));
                            recyclerView.removeCallbacks(this.f104131OooO0oo);
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }
}
