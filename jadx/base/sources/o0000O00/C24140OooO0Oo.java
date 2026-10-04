package o0000O00;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: o0000O00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24140OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap<Object, HashMap<String, float[]>> f81375OooO00o;

    public final float OooO00o(View view, String str) {
        HashMap<String, float[]> map;
        float[] fArr;
        HashMap<Object, HashMap<String, float[]>> map2 = this.f81375OooO00o;
        if (map2.containsKey(view) && (map = map2.get(view)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
