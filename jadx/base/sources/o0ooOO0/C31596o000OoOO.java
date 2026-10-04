package o0ooOO0;

import Oooo0oO.AbstractC21043OooOoO;
import Oooo0oO.C21047OooOoo0;
import OoooOOo.C21200OooOOO0;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.p002ui.platform.C21612OooO0oo;
import com.orion.notein.global.R;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.WeakHashMap;
import o000oOoO.C24633OooO00o;
import o00oO0O.C25503OooOoOO;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0ooOO0.o000OoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31596o000OoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f112899OooO00o = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C21612OooO0oo OooO00o(AbstractComposeView abstractComposeView, AbstractC21043OooOoO parent, C24633OooO00o c24633OooO00o) {
        AndroidComposeView androidComposeView;
        C21612OooO0oo c21612OooO0oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractComposeView, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        if (C31600o00oO0o.f112905OooO00o.compareAndSet(false, true)) {
            C33695OooO0o0 c33695OooO0o0OooO00o = C33703OooOOO0.OooO00o(-1, 6, null);
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o((InterfaceC34415OooO0oo) C31542OoooOOO.f112743Oooo0.getValue()), null, null, new C31601o00ooo(c33695OooO0o0OooO00o, null), 3);
            oo000o oo000oVar = new oo000o(c33695OooO0o0OooO00o);
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                C21200OooOOO0.f61493OooO = oOo000Oo.OooOo.OooooOo((Collection) C21200OooOOO0.f61493OooO, oo000oVar);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            C21200OooOOO0.OooO00o();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                Context context = abstractComposeView.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context, "context");
                androidComposeView = new AndroidComposeView(context);
                abstractComposeView.addView(androidComposeView.getView(), f112899OooO00o);
            }
            if (Build.VERSION.SDK_INT >= 29 && !C31591o000Oo.f112894OooO00o.OooO00o(androidComposeView).isEmpty()) {
                androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                C31604o0ooOoO.OooO00o oooO00o = C31604o0ooOoO.f112933OooO00o;
                try {
                    Field declaredField = C31604o0ooOoO.class.getDeclaredField("isDebugInspectorInfoEnabled");
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(null, true);
                } catch (Exception unused) {
                    Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
                }
            }
            C25503OooOoOO root = androidComposeView.getRoot();
            kotlin.jvm.internal.OooOOO0.OooO0oO(root, "root");
            C21047OooOoo0 c21047OooOoo0 = new C21047OooOoo0(parent, new o00oO0O.o0O0O00(root));
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            c21612OooO0oo = tag instanceof C21612OooO0oo ? (C21612OooO0oo) tag : null;
            if (c21612OooO0oo == null) {
                c21612OooO0oo = new C21612OooO0oo(androidComposeView, c21047OooOoo0);
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, c21612OooO0oo);
            }
            c21612OooO0oo.OooOOOO(c24633OooO00o);
            return c21612OooO0oo;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            C31604o0ooOoO.OooO00o oooO00o2 = C31604o0ooOoO.f112933OooO00o;
            Field declaredField2 = C31604o0ooOoO.class.getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField2.setAccessible(true);
            declaredField2.setBoolean(null, true);
        }
        C25503OooOoOO root2 = androidComposeView.getRoot();
        kotlin.jvm.internal.OooOOO0.OooO0oO(root2, "root");
        C21047OooOoo0 c21047OooOoo02 = new C21047OooOoo0(parent, new o00oO0O.o0O0O00(root2));
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof C21612OooO0oo) {
        }
        if (c21612OooO0oo == null) {
        }
        c21612OooO0oo.OooOOOO(c24633OooO00o);
        return c21612OooO0oo;
    }
}
