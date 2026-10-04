package o00oo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: o00oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25635OooO00o implements InterfaceC25636OooO0Oo {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final HashSet f87490OooOoO0 = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooOO0 f87491OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HashMap f87492OooOo0o = new HashMap();

    @Override // o00oOoO.InterfaceC25615OooO00o
    public final void OooOooo(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f87490OooOoO0) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f87492OooOo0o.put(str, obj);
            }
        }
    }

    @Override // o00oOoO.InterfaceC25615OooO00o
    public final void Oooo000(Object obj, String str) {
        Boolean bool = Boolean.FALSE;
        if (f87490OooOoO0.contains("is_rounded")) {
            this.f87492OooOo0o.put("is_rounded", bool);
        }
    }

    @Override // o00oo.InterfaceC25639OooO0oo, o00oOoO.InterfaceC25615OooO00o
    public final Map<String, Object> getExtras() {
        return this.f87492OooOo0o;
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public InterfaceC25640OooOO0o o000() {
        return OooOO0O.f87512OooO0Oo;
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public boolean o000O() {
        return false;
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final OooO o00O0O() {
        if (this.f87491OooOo == null) {
            getWidth();
            getHeight();
            OooO0o0();
            o000();
            this.f87491OooOo = new OooOO0(this.f87492OooOo0o);
        }
        return this.f87491OooOo;
    }
}
