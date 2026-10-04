package OoooOOo;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OoooOOo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21199OooOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f61490OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f61491OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f61492OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21199OooOOO(int i, Object obj, Object obj2) {
        super(1);
        this.f61491OooOo0o = i;
        this.f61490OooOo = obj;
        this.f61492OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f61491OooOo0o) {
            case 0:
                ((InterfaceC32507OooOO0o) this.f61490OooOo).invoke(obj);
                ((InterfaceC32507OooOO0o) this.f61492OooOoO0).invoke(obj);
                break;
            default:
                ByteBuffer buffer = (ByteBuffer) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
                ((C24033OooOooo) this.f61490OooOo).f80940OooOo0o = ((ReadableByteChannel) this.f61492OooOoO0).read(buffer);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
