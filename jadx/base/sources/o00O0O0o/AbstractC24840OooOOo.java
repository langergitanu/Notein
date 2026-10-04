package o00O0O0o;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.UUID;
import o00O0O0o.C24841OooOOo0;
import o00O0OoO.C24880OooOOoo;

/* JADX INFO: renamed from: o00O0O0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24840OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f84270OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24880OooOOoo f84271OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f84272OooO0OO;

    /* JADX INFO: renamed from: o00O0O0o.OooOOo$OooO00o */
    public static abstract class OooO00o<B extends OooO00o<?, ?>, W extends AbstractC24840OooOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public UUID f84273OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C24880OooOOoo f84274OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashSet f84275OooO0OO;

        public OooO00o(Class<? extends ListenableWorker> cls) {
            HashSet hashSet = new HashSet();
            this.f84275OooO0OO = hashSet;
            this.f84273OooO00o = UUID.randomUUID();
            this.f84274OooO0O0 = new C24880OooOOoo(this.f84273OooO00o.toString(), cls.getName());
            hashSet.add(cls.getName());
        }

        public final W OooO00o() {
            W w = (W) OooO0O0();
            OooO0OO oooO0OO = this.f84274OooO0O0.f84465OooOO0;
            boolean z = oooO0OO.f84239OooO0oo.f84240OooO00o.size() > 0 || oooO0OO.f84235OooO0Oo || oooO0OO.f84233OooO0O0 || oooO0OO.f84234OooO0OO;
            C24880OooOOoo c24880OooOOoo = this.f84274OooO0O0;
            if (c24880OooOOoo.f84473OooOOo0) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (c24880OooOOoo.f84463OooO0oO > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f84273OooO00o = UUID.randomUUID();
            C24880OooOOoo c24880OooOOoo2 = this.f84274OooO0O0;
            C24880OooOOoo c24880OooOOoo3 = new C24880OooOOoo();
            c24880OooOOoo3.f84458OooO0O0 = C24841OooOOo0.OooO00o.f84283OooOo0o;
            androidx.work.OooO0O0 oooO0O0 = androidx.work.OooO0O0.f66685OooO0OO;
            c24880OooOOoo3.f84462OooO0o0 = oooO0O0;
            c24880OooOOoo3.f84461OooO0o = oooO0O0;
            c24880OooOOoo3.f84465OooOO0 = OooO0OO.f84231OooO;
            c24880OooOOoo3.f84467OooOO0o = EnumC24833OooO00o.f84227OooOo0o;
            c24880OooOOoo3.f84469OooOOO0 = 30000L;
            c24880OooOOoo3.f84471OooOOOo = -1L;
            c24880OooOOoo3.f84472OooOOo = OooOOOO.f84268OooOo0o;
            c24880OooOOoo3.f84457OooO00o = c24880OooOOoo2.f84457OooO00o;
            c24880OooOOoo3.f84459OooO0OO = c24880OooOOoo2.f84459OooO0OO;
            c24880OooOOoo3.f84458OooO0O0 = c24880OooOOoo2.f84458OooO0O0;
            c24880OooOOoo3.f84460OooO0Oo = c24880OooOOoo2.f84460OooO0Oo;
            c24880OooOOoo3.f84462OooO0o0 = new androidx.work.OooO0O0(c24880OooOOoo2.f84462OooO0o0);
            c24880OooOOoo3.f84461OooO0o = new androidx.work.OooO0O0(c24880OooOOoo2.f84461OooO0o);
            c24880OooOOoo3.f84463OooO0oO = c24880OooOOoo2.f84463OooO0oO;
            c24880OooOOoo3.f84464OooO0oo = c24880OooOOoo2.f84464OooO0oo;
            c24880OooOOoo3.f84456OooO = c24880OooOOoo2.f84456OooO;
            OooO0OO oooO0OO2 = c24880OooOOoo2.f84465OooOO0;
            OooO0OO oooO0OO3 = new OooO0OO();
            oooO0OO3.f84232OooO00o = EnumC24838OooOO0o.f84258OooOo0o;
            oooO0OO3.f84236OooO0o = -1L;
            oooO0OO3.f84238OooO0oO = -1L;
            oooO0OO3.f84239OooO0oo = new C24834OooO0Oo();
            oooO0OO3.f84233OooO0O0 = oooO0OO2.f84233OooO0O0;
            oooO0OO3.f84234OooO0OO = oooO0OO2.f84234OooO0OO;
            oooO0OO3.f84232OooO00o = oooO0OO2.f84232OooO00o;
            oooO0OO3.f84235OooO0Oo = oooO0OO2.f84235OooO0Oo;
            oooO0OO3.f84237OooO0o0 = oooO0OO2.f84237OooO0o0;
            oooO0OO3.f84239OooO0oo = oooO0OO2.f84239OooO0oo;
            c24880OooOOoo3.f84465OooOO0 = oooO0OO3;
            c24880OooOOoo3.f84466OooOO0O = c24880OooOOoo2.f84466OooOO0O;
            c24880OooOOoo3.f84467OooOO0o = c24880OooOOoo2.f84467OooOO0o;
            c24880OooOOoo3.f84469OooOOO0 = c24880OooOOoo2.f84469OooOOO0;
            c24880OooOOoo3.f84468OooOOO = c24880OooOOoo2.f84468OooOOO;
            c24880OooOOoo3.f84470OooOOOO = c24880OooOOoo2.f84470OooOOOO;
            c24880OooOOoo3.f84471OooOOOo = c24880OooOOoo2.f84471OooOOOo;
            c24880OooOOoo3.f84473OooOOo0 = c24880OooOOoo2.f84473OooOOo0;
            c24880OooOOoo3.f84472OooOOo = c24880OooOOoo2.f84472OooOOo;
            this.f84274OooO0O0 = c24880OooOOoo3;
            c24880OooOOoo3.f84457OooO00o = this.f84273OooO00o.toString();
            return w;
        }

        public abstract W OooO0O0();
    }

    public AbstractC24840OooOOo(UUID uuid, C24880OooOOoo c24880OooOOoo, HashSet hashSet) {
        this.f84270OooO00o = uuid;
        this.f84271OooO0O0 = c24880OooOOoo;
        this.f84272OooO0OO = hashSet;
    }
}
