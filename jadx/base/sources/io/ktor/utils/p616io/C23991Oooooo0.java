package io.ktor.utils.p616io;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: io.ktor.utils.io.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23991Oooooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f80787OooO00o = 0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC23990Oooooo interfaceC23990Oooooo, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23989OooooOo c23989OooooOo;
        if (abstractC32479OooO0OO instanceof C23989OooooOo) {
            c23989OooooOo = (C23989OooooOo) abstractC32479OooO0OO;
            int i = c23989OooooOo.f80786OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23989OooooOo.f80786OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c23989OooooOo = new C23989OooooOo(abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c23989OooooOo.f80784OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23989OooooOo.f80786OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c23989OooooOo.f80785OooOo0o = interfaceC23990Oooooo;
            c23989OooooOo.f80786OooOoO0 = 1;
            objOooO0O0 = C23988OooooOO.OooO0O0(interfaceC23986Ooooo0o, interfaceC23990Oooooo, j, c23989OooooOo);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC23990Oooooo = c23989OooooOo.f80785OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        long jLongValue = ((Number) objOooO0O0).longValue();
        C23992OoooooO.OooO0O0(interfaceC23990Oooooo);
        return new Long(jLongValue);
    }

    public static final void OooO0O0(int i, View view) {
        OooOOO0.OooO0oO(view, "<this>");
        ViewParent parent = view.getParent();
        final ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        final C32443OooOOO[] c32443OooOOOArr = {new C32443OooOOO(view, Integer.valueOf(i))};
        viewGroup.post(new Runnable() { // from class: o0O0OoOo.OooO0Oo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                C25901OooO0O0 c25901OooO0O0;
                ViewGroup viewGroup2 = viewGroup;
                TouchDelegate touchDelegate = viewGroup2.getTouchDelegate();
                if (touchDelegate instanceof C25901OooO0O0) {
                    c25901OooO0O0 = (C25901OooO0O0) touchDelegate;
                } else {
                    c25901OooO0O0 = new C25901OooO0O0(viewGroup2);
                    viewGroup2.setTouchDelegate(c25901OooO0O0);
                }
                for (C32443OooOOO c32443OooOOO : c32443OooOOOArr) {
                    View view2 = (View) c32443OooOOO.f116638OooOo0o;
                    int iIntValue = ((Number) c32443OooOOO.f116637OooOo).intValue();
                    if (OooOOO0.OooO0O0(view2.getParent(), viewGroup2)) {
                        Rect rect = new Rect();
                        view2.getHitRect(rect);
                        int i2 = -((int) (iIntValue * viewGroup2.getResources().getDisplayMetrics().density));
                        rect.inset(i2, i2);
                        c25901OooO0O0.getClass();
                        c25901OooO0O0.f88430OooO00o.put(view2, new TouchDelegate(rect, view2));
                    }
                }
            }
        });
    }
}
