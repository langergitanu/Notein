package com.orion.notein.p607ui.creative_library;

import OoooooO.C21445Oooo;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.google.firebase.firestore.util.OooOOO;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOoo0O.C27831OooO;
import o0OOoo0O.C27851OooOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/Oooo0;", "Landroidx/lifecycle/Ooooooo;", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class Oooo0 extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f71240OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27304OooOo f71241OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27831OooO f71242OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27851OooOo0 f71243OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33772OooooOo f71244OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33768Ooooo00 f71245OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f71246OooOO0;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19184OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f71247OooO00o;

            public C19184OooO00o(String materialId) {
                OooOOO0.OooO0oO(materialId, "materialId");
                this.f71247OooO00o = materialId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C19184OooO00o) && OooOOO0.OooO0O0(this.f71247OooO00o, ((C19184OooO00o) obj).f71247OooO00o);
            }

            public final int hashCode() {
                return this.f71247OooO00o.hashCode();
            }

            public final String toString() {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("NavigateToMyTemplate(materialId="), this.f71247OooO00o, ")");
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f71248OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<C23033OooOO0o.OooO00o> f71249OooO0O0;

        public OooO0O0() {
            this(0);
        }

        public static OooO0O0 OooO00o(OooO0O0 oooO0O0, ArrayList arrayList, int i) {
            boolean z = (i & 1) != 0 ? oooO0O0.f71248OooO00o : true;
            List<C23033OooOO0o.OooO00o> items = arrayList;
            if ((i & 2) != 0) {
                items = oooO0O0.f71249OooO0O0;
            }
            oooO0O0.getClass();
            oooO0O0.getClass();
            OooOOO0.OooO0oO(items, "items");
            return new OooO0O0(items, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f71248OooO00o == oooO0O0.f71248OooO00o && OooOOO0.OooO0O0(this.f71249OooO0O0, oooO0O0.f71249OooO0O0);
        }

        public final int hashCode() {
            return C21445Oooo.OooO00o(this.f71249OooO0O0, Boolean.hashCode(this.f71248OooO00o) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UiState(isLoading=");
            sb.append(this.f71248OooO00o);
            sb.append(", items=");
            return OooOOO.OooO0O0(", error=null)", sb, this.f71249OooO0O0);
        }

        public OooO0O0(List items, boolean z) {
            OooOOO0.OooO0oO(items, "items");
            this.f71248OooO00o = z;
            this.f71249OooO0O0 = items;
        }

        public /* synthetic */ OooO0O0(int i) {
            this(C34434OooOoO.f123453OooOo0o, false);
        }
    }

    public Oooo0(InterfaceC27304OooOo downloadRepository, C27851OooOo0 c27851OooOo0, C27831OooO c27831OooO) {
        OooOOO0.OooO0oO(downloadRepository, "downloadRepository");
        this.f71241OooO0Oo = downloadRepository;
        this.f71243OooO0o0 = c27851OooOo0;
        this.f71242OooO0o = c27831OooO;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f71244OooO0oO = c33772OooooOoOooO0O0;
        this.f71245OooO0oo = C25252OooO0Oo.OooO0O0(c33772OooooOoOooO0O0);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(new OooO0O0(0));
        this.f71240OooO = c33781o00o0OOooO00o;
        this.f71246OooOO0 = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C23056Oooo0OO(this, null), 3);
    }
}
