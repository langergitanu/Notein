package o0O0O0o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.google.firebase.firestore.remote.RunnableC22702OooOOo0;
import com.lzf.easyfloat.data.FloatConfig;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOO0;
import o0O0O0oo.C25875OooO0O0;
import o0O0O0oo.C25876OooO0Oo;
import o0O0O0oo.C25877OooO0o0;
import o0o000.OooO;
import o0oOOOoo.C30837OooO00o;
import o0ooO.EnumC31414OooO00o;

/* JADX INFO: renamed from: o0O0O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25871OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f88280OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f88281OooO0O0;

    public C25871OooO00o(Context context) {
        this.f88280OooO00o = context;
        this.f88281OooO0O0 = new FloatConfig(null, null, null, false, false, false, false, false, false, null, null, false, false, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 536870911, null);
    }

    public void OooO00o(String str) {
        OooO oooO;
        FloatConfig floatConfig = (FloatConfig) this.f88281OooO0O0;
        floatConfig.getCallbacks();
        o0O0OO0.OooO00o floatCallbacks = floatConfig.getFloatCallbacks();
        if (floatCallbacks != null && (oooO = floatCallbacks.OooO00o().f88336OooO00o) != null) {
            oooO.invoke(Boolean.FALSE, str, null);
        }
        String msg = str.toString();
        OooOOO0.OooO0oO(msg, "msg");
        int iHashCode = str.hashCode();
        if (iHashCode != 324317221) {
            if (iHashCode != 832581388) {
                if (iHashCode != 952571600 || !str.equals("Uninitialized exception. You need to initialize in the application.")) {
                    return;
                }
            } else if (!str.equals("No layout exception. You need to set up the layout file.")) {
                return;
            }
        } else if (!str.equals("Context exception. Activity float need to pass in a activity context.")) {
            return;
        }
        throw new Exception(str);
    }

    public void OooO0O0() {
        OooO oooO;
        Activity activity;
        Activity activity2;
        OooO oooO2;
        View viewFindViewById;
        Window window;
        View decorView;
        ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap = C25877OooO0o0.f88312OooO00o;
        Context context = (Context) this.f88280OooO00o;
        FloatConfig config = (FloatConfig) this.f88281OooO0O0;
        OooOOO0.OooO0oO(config, "config");
        String floatTag = config.getFloatTag();
        if (floatTag == null) {
            floatTag = "default";
        }
        config.setFloatTag(floatTag);
        ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap2 = C25877OooO0o0.f88312OooO00o;
        String floatTag2 = config.getFloatTag();
        OooOOO0.OooO0Oo(floatTag2);
        if (concurrentHashMap2.containsKey(floatTag2)) {
            config.getCallbacks();
            o0O0OO0.OooO00o floatCallbacks = config.getFloatCallbacks();
            if (floatCallbacks == null || (oooO = floatCallbacks.OooO00o().f88336OooO00o) == null) {
                return;
            }
            oooO.invoke(Boolean.FALSE, "Tag exception. You need to set different EasyFloat tag.", null);
            return;
        }
        C25875OooO0O0 c25875OooO0O0 = new C25875OooO0O0(context, config);
        C25876OooO0Oo c25876OooO0Oo = new C25876OooO0Oo(config, c25875OooO0O0);
        if (config.getShowPattern() == EnumC31414OooO00o.f112175OooOo0o) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                WeakReference weakReference = OooO.OooO00o.f58143OooO0O0;
                activity = weakReference == null ? null : (Activity) weakReference.get();
            }
            if (((activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getWindowToken()) == null) {
                if (context instanceof Activity) {
                    activity2 = (Activity) context;
                } else {
                    WeakReference weakReference2 = OooO.OooO00o.f58143OooO0O0;
                    activity2 = weakReference2 == null ? null : (Activity) weakReference2.get();
                }
                if (activity2 != null && (viewFindViewById = activity2.findViewById(R.id.content)) != null) {
                    viewFindViewById.post(new RunnableC22702OooOOo0(2, c25876OooO0Oo, c25875OooO0O0));
                    return;
                }
                config.getCallbacks();
                o0O0OO0.OooO00o floatCallbacks2 = config.getFloatCallbacks();
                if (floatCallbacks2 == null || (oooO2 = floatCallbacks2.OooO00o().f88336OooO00o) == null) {
                    return;
                }
                oooO2.invoke(Boolean.FALSE, "Activity is null.", null);
                return;
            }
        }
        c25876OooO0Oo.OooO00o(c25875OooO0O0.OooO0O0());
    }

    public C25871OooO00o(PageLayerEditor pageLayerEditor, C30837OooO00o c30837OooO00o) {
        this.f88280OooO00o = pageLayerEditor;
        this.f88281OooO0O0 = c30837OooO00o;
    }
}
