package androidx.fragment.app;

import OooOo.OooO00o;
import android.view.View;
import androidx.core.app.SharedElementCallback;
import androidx.transition.C22093OooO0o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.fragment.app.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21919OoooO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C21917OoooO0 f65064OooO00o = new C21917OoooO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AbstractC21921OoooOO0 f65065OooO0O0;

    static {
        AbstractC21921OoooOO0 abstractC21921OoooOO0;
        try {
            abstractC21921OoooOO0 = (AbstractC21921OoooOO0) C22093OooO0o0.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC21921OoooOO0 = null;
        }
        f65065OooO0O0 = abstractC21921OoooOO0;
    }

    public static final void OooO00o(Fragment inFragment, Fragment outFragment, boolean z, OooOo.OooO00o<String, View> sharedElements, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inFragment, "inFragment");
        kotlin.jvm.internal.OooOOO0.OooO0oO(outFragment, "outFragment");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sharedElements, "sharedElements");
        SharedElementCallback enterTransitionCallback = z ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.f58550OooOoO0);
            Iterator it = ((OooO00o.C18962OooO00o) sharedElements.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.f58550OooOoO0);
            Iterator it2 = ((OooO00o.C18962OooO00o) sharedElements.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    public static final String OooO0O0(OooOo.OooO00o<String, String> oooO00o, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (OooO00o.C18962OooO00o) oooO00o.entrySet()) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) oOo000Oo.OooOo.Oooo(arrayList);
    }

    public static final void OooO0OO(int i, ArrayList views) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
