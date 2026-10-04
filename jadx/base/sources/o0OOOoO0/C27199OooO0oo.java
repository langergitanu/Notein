package o0OOOoO0;

import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import java.util.Arrays;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOOoO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27199OooO0oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f94986OooOo0o;

    public /* synthetic */ C27199OooO0oo(int i) {
        this.f94986OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f94986OooOo0o) {
            case 0:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            default:
                return Boolean.valueOf(TiledPagePreviewVOFilter.getFilter$lambda$2((TiledPagePreviewVO) obj));
        }
    }
}
