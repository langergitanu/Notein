package o0oo0oO0;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import o000o0O0.AbstractC24602Oooo0o0;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0ooo.C31412OooO00o;

/* JADX INFO: renamed from: o0oo0oO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31337OooO0oO implements InterfaceC31322OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final LinkedHashMap f111895OooOo = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f111896OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[][] f111897OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC24602Oooo0o0 f111898OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte[][] f111899OooOoOO;

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final C31412OooO00o OooO0OO() {
        return new C31412OooO00o((List) this.f111895OooOo.get("FontBBox"));
    }

    public final void OooO0Oo(Object obj, String str) {
        if (obj != null) {
            this.f111895OooOo.put(str, obj);
        }
    }

    public abstract C31355OooOo00 OooO0o0(int i) throws IOException;

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final String getName() {
        return this.f111896OooOo0o;
    }

    public final String toString() {
        return getClass().getSimpleName() + "[name=" + this.f111896OooOo0o + ", topDict=" + this.f111895OooOo + ", charset=" + this.f111898OooOoO0 + ", charStrings=" + Arrays.deepToString(this.f111897OooOoO) + "]";
    }
}
