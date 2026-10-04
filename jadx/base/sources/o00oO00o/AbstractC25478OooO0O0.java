package o00oO00o;

import android.graphics.drawable.Animatable;
import java.util.concurrent.atomic.AtomicLong;
import o00o0oo.AbstractC25464OooO0OO;
import o00oO00o.AbstractC25478OooO0O0;
import o00oo000.C25644OooO0OO;
import o00ooO.C25732OooO0O0;
import o00ooO0o.C25763OooO00o;
import o0oOoOOo.C31026OooO00o;
import o0ooOO.InterfaceC31496OooO00o;

/* JADX INFO: renamed from: o00oO00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25478OooO0O0<BUILDER extends AbstractC25478OooO0O0<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C25763OooO00o f86842OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C31026OooO00o f86843OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f86844OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public InterfaceC31496OooO00o f86845OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f86840OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final NullPointerException f86839OooO0o = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final AtomicLong f86841OooO0oO = new AtomicLong();

    /* JADX INFO: renamed from: o00oO00o.OooO0O0$OooO00o */
    public class OooO00o extends C25480OooO0Oo<Object> {
        @Override // o00oO00o.C25480OooO0Oo, o00oO00o.InterfaceC25482OooO0o0
        public final void OooO0o0(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00oO00o.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class EnumC19707OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ EnumC19707OooO0O0[] f86846OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC19707OooO0O0 f86847OooOo0o;

        static {
            EnumC19707OooO0O0 enumC19707OooO0O0 = new EnumC19707OooO0O0("FULL_FETCH", 0);
            f86847OooOo0o = enumC19707OooO0O0;
            f86846OooOo = new EnumC19707OooO0O0[]{enumC19707OooO0O0, new EnumC19707OooO0O0("DISK_CACHE", 1), new EnumC19707OooO0O0("BITMAP_MEMORY_CACHE", 2)};
        }

        public EnumC19707OooO0O0() {
            throw null;
        }

        public static EnumC19707OooO0O0 valueOf(String str) {
            return (EnumC19707OooO0O0) Enum.valueOf(EnumC19707OooO0O0.class, str);
        }

        public static EnumC19707OooO0O0[] values() {
            return (EnumC19707OooO0O0[]) f86846OooOo.clone();
        }
    }

    public final AbstractC25477OooO00o OooO00o() {
        C25732OooO0O0.OooO00o();
        C25644OooO0OO c25644OooO0OOOooO0OO = OooO0OO();
        C31026OooO00o c31026OooO00o = this.f86843OooO0O0;
        if (c31026OooO00o != null) {
            c25644OooO0OOOooO0OO.OooO0o(c31026OooO00o);
        }
        if (this.f86844OooO0OO) {
            c25644OooO0OOOooO0OO.OooO0o(f86840OooO0o0);
        }
        C25732OooO0O0.OooO00o();
        return c25644OooO0OOOooO0OO;
    }

    public abstract AbstractC25464OooO0OO OooO0O0(C25644OooO0OO c25644OooO0OO, String str, Object obj, EnumC19707OooO0O0 enumC19707OooO0O0);

    public abstract C25644OooO0OO OooO0OO();
}
