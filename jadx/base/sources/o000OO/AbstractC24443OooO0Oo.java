package o000OO;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: o000OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24443OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f82475OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f82476OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.OooO00o> f82477OooO0OO;

    public abstract void OooO00o(HashMap<String, o0000O0O.OooO0OO> map);

    @Override // 
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC24443OooO0Oo clone();

    public AbstractC24443OooO0Oo OooO0OO(AbstractC24443OooO0Oo abstractC24443OooO0Oo) {
        this.f82475OooO00o = abstractC24443OooO0Oo.f82475OooO00o;
        this.f82476OooO0O0 = abstractC24443OooO0Oo.f82476OooO0O0;
        this.f82477OooO0OO = abstractC24443OooO0Oo.f82477OooO0OO;
        return this;
    }

    public abstract void OooO0Oo(HashSet<String> hashSet);

    public void OooO0o(HashMap<String, Integer> map) {
    }

    public abstract void OooO0o0(Context context, AttributeSet attributeSet);
}
