package com.orion.notein.p607ui.backup;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.repo.backup.C22916Oooo0oO;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import com.orion.notein.p607ui.backup.netdisk.CloudBackupWorker;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o000oooo.C24761OooO;
import o00O0O0o.C24834OooO0Oo;
import o00O0O0o.C24839OooOOOo;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.EnumC24838OooOO0o;
import o00O0OO0.C24847OooO0oO;
import o00O0OoO.C24880OooOOoo;
import o00O0Ooo.C24895OooO0O0;
import o00O0Ooo.C24908OooOOOo;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import o0OOo0o.C27335OooOOo;
import o0OOo0o.C27342OooOoO0;
import o0OOo0o.C27343OooOoOO;
import o0OOo0o.C27351Oooo0O0;
import o0OOo0o.C27570o00oOoo0;
import o0OOo0o.C27597o00ooo00;
import o0oOo0o0.AbstractC30978OooO;
import o0oOoOo.C31047OooOOoo;
import o0oOoOo.C31055OooOoOO;
import o0oOoo00.C31114OooO;
import o0oOoo00.C31133OooOOoo;
import o0oOoo00.C31135OooOo0;
import o0oOoo00.C31136OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/OooO00o;", "Landroidx/lifecycle/Ooooooo;", "OooO0OO", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO00o extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f70685OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f70686OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27570o00oOoo0 f70687OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27351Oooo0O0 f70688OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27597o00ooo00 f70689OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f70690OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00000OO f70691OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33769Ooooo0o f70692OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f70693OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33772OooooOo f70694OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f70695OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33772OooooOo f70696OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33781o00o0O f70697OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33772OooooOo f70698OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33781o00o0O f70699OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33772OooooOo f70700OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33769Ooooo0o f70701OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33772OooooOo f70702OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33772OooooOo f70703OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33772OooooOo f70704OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33772OooooOo f70705OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33781o00o0O f70706OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33769Ooooo0o f70707OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33781o00o0O f70708OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33781o00o0O f70709OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33781o00o0O f70710OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33781o00o0O f70711OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33769Ooooo0o f70712OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C23004OooO0Oo f70713Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C33769Ooooo0o f70714Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33769Ooooo0o f70715Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33781o00o0O f70716Oooo00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$special$$inlined$flatMapLatest$1", m80623f = "CloudBackupViewModel.kt", m80624l = {196, 189}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Boolean>, List<? extends C31047OooOOoo>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f70717OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70718OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f70720OooOoO0;

        public OooO(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, List<? extends C31047OooOOoo> list, Continuation<? super C32460OooOooO> continuation) {
            OooO oooO = OooO00o.this.new OooO(continuation);
            oooO.f70717OooOo = interfaceC33723OooO0oO;
            oooO.f70720OooOoO0 = list;
            return oooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        
            if (r8 == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        
            if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, r2, r7) != r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        
            return r0;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            Object next;
            InterfaceC33721OooO0o c33770OooooO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70718OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = this.f70717OooOo;
                Iterator it = ((List) this.f70720OooOoO0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C31047OooOOoo) next).f110852OooO0O0) {
                        break;
                    }
                }
                C31047OooOOoo c31047OooOOoo = (C31047OooOOoo) next;
                BackupFile.DiskVendor diskVendor = c31047OooOOoo != null ? c31047OooOOoo.f110851OooO00o : null;
                if (diskVendor == null || diskVendor == BackupFile.DiskVendor.None) {
                    c33770OooooO0 = new C33770OooooO0(new OooOOO(2, null));
                    this.f70717OooOo = null;
                    this.f70718OooOo0o = 2;
                } else {
                    C27351Oooo0O0 c27351Oooo0O0 = OooO00o.this.f70688OooO0o0;
                    this.f70717OooOo = interfaceC33723OooO0oO;
                    this.f70718OooOo0o = 1;
                    obj = c27351Oooo0O0.f95243OooO0oo.OooOO0(diskVendor);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33723OooO0oO = this.f70717OooOo;
                C32446OooOOOo.OooO0O0(obj);
            }
            c33770OooooO0 = new OooOOOO((InterfaceC33721OooO0o) obj);
            this.f70717OooOo = null;
            this.f70718OooOo0o = 2;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$1", m80623f = "CloudBackupViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C19156OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70722OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$1$1", m80623f = "CloudBackupViewModel.kt", m80624l = {StyleIdentifier.LIGHT_LIST_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class C19157OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f70723OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70724OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19158OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ OooO00o f70725OooOo0o;

                public C19158OooO00o(OooO00o oooO00o) {
                    this.f70725OooOo0o = oooO00o;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Integer num = (Integer) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95007OooO0o0);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CloudBackupViewModel");
                    c20358OooO00o.OooO0o0("start to call checkCloudBackupWorkInternal. vendorOrdinal: " + num, new Object[0]);
                    Object objOooO0o = OooO00o.OooO0o(this.f70725OooOo0o, num, continuation);
                    return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19157OooO00o(OooO00o oooO00o, Continuation<? super C19157OooO00o> continuation) {
                super(2, continuation);
                this.f70723OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19157OooO00o(this.f70723OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19157OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70724OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO00o oooO00o = this.f70723OooOo;
                    InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = oooO00o.f70690OooO0oo.getData();
                    C19158OooO00o c19158OooO00o = new C19158OooO00o(oooO00o);
                    this.f70724OooOo0o = 1;
                    if (data.collect(c19158OooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C19156OooO00o(Continuation<? super C19156OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C19156OooO00o c19156OooO00o = OooO00o.this.new C19156OooO00o(continuation);
            c19156OooO00o.f70722OooOo0o = obj;
            return c19156OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19156OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f70722OooOo0o, null, null, new C19157OooO00o(OooO00o.this, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f70726OooO0OO = new OooO0O0("", C34434OooOoO.f123453OooOo0o);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f70727OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<C19159OooO00o> f70728OooO0O0;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static final class C19159OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f70729OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f70730OooO0O0;

            public C19159OooO00o(String path, String name) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
                kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
                this.f70729OooO00o = path;
                this.f70730OooO0O0 = name;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19159OooO00o)) {
                    return false;
                }
                C19159OooO00o c19159OooO00o = (C19159OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f70729OooO00o, c19159OooO00o.f70729OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f70730OooO0O0, c19159OooO00o.f70730OooO0O0);
            }

            public final int hashCode() {
                return this.f70730OooO0O0.hashCode() + (this.f70729OooO00o.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Destination(path=");
                sb.append(this.f70729OooO00o);
                sb.append(", name=");
                return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f70730OooO0O0, ")");
            }
        }

        public OooO0O0(String root, List<C19159OooO00o> list) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(root, "root");
            this.f70727OooO00o = root;
            this.f70728OooO0O0 = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f70727OooO00o, oooO0O0.f70727OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f70728OooO0O0, oooO0O0.f70728OooO0O0);
        }

        public final int hashCode() {
            return this.f70728OooO0O0.hashCode() + (this.f70727OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "BreadcrumbNavigator(root=" + this.f70727OooO00o + ", destinationStack=" + this.f70728OooO0O0 + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0OO f70731OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f70732OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0OO[] f70733OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0OO f70734OooOoO0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                com.orion.notein.ui.backup.OooO00o$OooO0OO r0 = new com.orion.notein.ui.backup.OooO00o$OooO0OO
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.backup.OooO00o.OooO0OO.f70732OooOo0o = r0
                com.orion.notein.ui.backup.OooO00o$OooO0OO r1 = new com.orion.notein.ui.backup.OooO00o$OooO0OO
                java.lang.String r2 = "SUCCESS"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.backup.OooO00o.OooO0OO.f70731OooOo = r1
                com.orion.notein.ui.backup.OooO00o$OooO0OO r2 = new com.orion.notein.ui.backup.OooO00o$OooO0OO
                java.lang.String r3 = "FAILED"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.backup.OooO00o.OooO0OO.f70734OooOoO0 = r2
                com.orion.notein.ui.backup.OooO00o$OooO0OO[] r0 = new com.orion.notein.ui.backup.OooO00o.OooO0OO[]{r0, r1, r2}
                com.orion.notein.ui.backup.OooO00o.OooO0OO.f70733OooOoO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.backup.OooO00o.OooO0OO.<clinit>():void");
        }

        public OooO0OO() {
            throw null;
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) f70733OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23004OooO0Oo extends AbstractC30978OooO {
        public C23004OooO0Oo() {
        }

        @Override // o0oOo0o0.AbstractC30978OooO
        public final void OooO00o(float f) {
            C33781o00o0O c33781o00o0O = OooO00o.this.f70697OooOOOo;
            Float fValueOf = Float.valueOf(f);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, fValueOf);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$confirmRestoreFiles$1", m80623f = "CloudBackupViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32511OooOOoo<Map<String, ? extends List<? extends BackupFile>>, OooO0O0, String, Set<? extends String>, Continuation<? super List<? extends C31055OooOoOO>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ OooO0O0 f70736OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Map f70737OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Set f70738OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ String f70739OooOoO0;

        @Override // oO0O000o.InterfaceC32511OooOOoo
        public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            OooO0o oooO0o = new OooO0o(5, (Continuation) serializable);
            oooO0o.f70737OooOo0o = (Map) obj;
            oooO0o.f70736OooOo = (OooO0O0) obj2;
            oooO0o.f70739OooOoO0 = (String) obj3;
            oooO0o.f70738OooOoO = (Set) obj4;
            return oooO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v7, types: [oOo000Oo.OooOoO] */
        /* JADX WARN: Type inference failed for: r12v8 */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ?? arrayList;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Map map = this.f70737OooOo0o;
            OooO0O0 oooO0O0 = this.f70736OooOo;
            String str = this.f70739OooOoO0;
            Set set = this.f70738OooOoO;
            if (map == null || oooO0O0.f70728OooO0O0.isEmpty()) {
                return null;
            }
            List list = (List) map.get(((OooO0O0.C19159OooO00o) OooOo.OoooOOo(oooO0O0.f70728OooO0O0)).f70729OooO00o);
            if (list != null) {
                ArrayList<BackupFile> arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    BackupFile backupFile = (BackupFile) obj2;
                    if (str.length() == 0 || C33599OooOo0O.OooOoOO(backupFile.getName(), str, true)) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                for (BackupFile backupFile2 : arrayList2) {
                    arrayList.add(new C31055OooOoOO(backupFile2.getId(), backupFile2.getName(), backupFile2.getPath(), backupFile2.isDir(), backupFile2.getCreationTime(), set.contains(backupFile2.getId())));
                }
            } else {
                arrayList = C34434OooOoO.f123453OooOo0o;
            }
            final C31135OooOo0 c31135OooOo0 = new C31135OooOo0();
            return OooOo.o00O0O((Iterable) arrayList, new Comparator() { // from class: o0oOoo00.OooOo0O
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return ((Number) c31135OooOo0.invoke(obj3, obj4)).intValue();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$checkCloudBackupWork$1", m80623f = "CloudBackupViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23005OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        public C23005OooO0o0(Continuation<? super C23005OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO00o.this.new C23005OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23005OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            o00O0OO0.OooOO0O oooOO0O = OooO00o.this.f70685OooO;
            oooOO0O.getClass();
            C24908OooOOOo c24908OooOOOo = new C24908OooOOOo(oooOO0O);
            oooOO0O.f84363OooO0Oo.f87293OooO00o.execute(c24908OooOOOo);
            List<C24841OooOOo0> list = (List) c24908OooOOOo.f84531OooOo0o.get();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(list);
            for (C24841OooOOo0 c24841OooOOo0 : list) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudBackupViewModel");
                c20358OooO00o.OooO0o0("Worker id: " + c24841OooOOo0.f84276OooO00o + ", state: " + c24841OooOOo0.f84277OooO0O0, new Object[0]);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$loadBackupFiles$1", m80623f = "CloudBackupViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5, StyleIdentifier.LIST_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class C23006OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public List f70741OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Serializable f70742OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f70744OooOoO0;

        public C23006OooO0oO(Continuation<? super C23006OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO00o.this.new C23006OooO0oO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23006OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x017d, code lost:
        
            if (com.orion.notein.p607ui.backup.OooO00o.OooO0oO(r10, (com.orion.notein.domain.models.backup.BackupException) r0, r18) != r2) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0173 A[PHI: r0
          0x0173: PHI (r0v3 'e' java.lang.Exception) = (r0v2 'e' java.lang.Exception), (r0v30 'e' java.lang.Exception) binds: [B:48:0x0170, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            BackupFile.DiskVendor diskVendor;
            Object objOooO0o;
            Object objOooO0o2;
            BackupFile.DiskVendor diskVendor2;
            List list;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70744OooOoO0;
            OooO00o oooO00o = OooO00o.this;
            try {
            } catch (Exception e) {
                e = e;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudBackupViewModel");
                c20358OooO00o.OooO0Oo(e, "Unable to load backup files.", new Object[0]);
                if (e instanceof BackupException) {
                    c20358OooO00o.OooO00o(C21532OooOOo.OooO0OO(((BackupException) e).getErrorCode(), "want to show error message, "), new Object[0]);
                    C33772OooooOo c33772OooooOo = oooO00o.f70704OooOo0O;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    this.f70742OooOo0o = e;
                    this.f70741OooOo = null;
                    this.f70744OooOoO0 = 3;
                    if (c33772OooooOo.emit(c32460OooOooO, this) != enumC32485OooO00o) {
                        C33781o00o0O c33781o00o0O = oooO00o.f70693OooOO0o;
                        BackupEvent backupEvent = new BackupEvent(5, ((BackupException) e).getErrorCode(), null, 4, null);
                        this.f70742OooOo0o = e;
                        this.f70744OooOoO0 = 4;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, backupEvent);
                        if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                }
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Iterator it = ((Iterable) oooO00o.f70701OooOo.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C31047OooOOoo) next).f110852OooO0O0) {
                        break;
                    }
                }
                C31047OooOOoo c31047OooOOoo = (C31047OooOOoo) next;
                if (c31047OooOOoo == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                diskVendor = c31047OooOOoo.f110851OooO00o;
                C27351Oooo0O0 c27351Oooo0O0 = oooO00o.f70688OooO0o0;
                this.f70742OooOo0o = diskVendor;
                this.f70744OooOoO0 = 1;
                c27351Oooo0O0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27342OooOoO0(diskVendor, false, c27351Oooo0O0, null), this);
                if (objOooO0o == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                diskVendor = (BackupFile.DiskVendor) this.f70742OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
            } else {
                if (i == 2) {
                    list = this.f70741OooOo;
                    BackupFile.DiskVendor diskVendor3 = (BackupFile.DiskVendor) this.f70742OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    diskVendor2 = diskVendor3;
                    objOooO0o2 = obj;
                    ArrayList arrayListOooooOO = OooOo.OooooOO(list, (List) objOooO0o2);
                    C33781o00o0O c33781o00o0O2 = oooO00o.f70709OooOoo;
                    C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, c34438OooOoo0);
                    C33781o00o0O c33781o00o0O3 = oooO00o.f70710OooOoo0;
                    LinkedHashMap linkedHashMapOooO0o0 = OooO00o.OooO0o0(oooO00o, arrayListOooooOO, diskVendor2);
                    c33781o00o0O3.getClass();
                    c33781o00o0O3.OooOO0(null, linkedHashMapOooO0o0);
                    BackupFile.Companion companion = BackupFile.INSTANCE;
                    File file = new File(companion.getRootDirPath(diskVendor2));
                    String absolutePath = file.getAbsolutePath();
                    kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                    String name = file.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                    OooO0O0.C19159OooO00o c19159OooO00o = new OooO0O0.C19159OooO00o(absolutePath, name);
                    C33781o00o0O c33781o00o0O4 = oooO00o.f70706OooOoO;
                    OooO0O0 oooO0O0 = new OooO0O0(companion.getRootDirPath(diskVendor2), com.facebook.soloader.OooOo.OooO0oO(c19159OooO00o));
                    c33781o00o0O4.getClass();
                    c33781o00o0O4.OooOO0(null, oooO0O0);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i == 3) {
                    e = (Exception) this.f70742OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C33781o00o0O c33781o00o0O5 = oooO00o.f70693OooOO0o;
                    BackupEvent backupEvent2 = new BackupEvent(5, ((BackupException) e).getErrorCode(), null, 4, null);
                    this.f70742OooOo0o = e;
                    this.f70744OooOoO0 = 4;
                    c33781o00o0O5.getClass();
                    c33781o00o0O5.OooOO0(null, backupEvent2);
                    if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                        this.f70742OooOo0o = null;
                        this.f70744OooOoO0 = 5;
                    }
                    return enumC32485OooO00o;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                e = (Exception) this.f70742OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f70742OooOo0o = null;
                this.f70744OooOoO0 = 5;
            }
            List list2 = (List) objOooO0o;
            C27351Oooo0O0 c27351Oooo0O02 = oooO00o.f70688OooO0o0;
            this.f70742OooOo0o = diskVendor;
            this.f70741OooOo = list2;
            this.f70744OooOoO0 = 2;
            c27351Oooo0O02.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27343OooOoOO(diskVendor, false, c27351Oooo0O02, null), this);
            if (objOooO0o2 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            diskVendor2 = diskVendor;
            list = list2;
            ArrayList arrayListOooooOO2 = OooOo.OooooOO(list, (List) objOooO0o2);
            C33781o00o0O c33781o00o0O22 = oooO00o.f70709OooOoo;
            C34438OooOoo0 c34438OooOoo02 = C34438OooOoo0.f123458OooOo0o;
            c33781o00o0O22.getClass();
            c33781o00o0O22.OooOO0(null, c34438OooOoo02);
            C33781o00o0O c33781o00o0O32 = oooO00o.f70710OooOoo0;
            LinkedHashMap linkedHashMapOooO0o02 = OooO00o.OooO0o0(oooO00o, arrayListOooooOO2, diskVendor2);
            c33781o00o0O32.getClass();
            c33781o00o0O32.OooOO0(null, linkedHashMapOooO0o02);
            BackupFile.Companion companion2 = BackupFile.INSTANCE;
            File file2 = new File(companion2.getRootDirPath(diskVendor2));
            String absolutePath2 = file2.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
            String name2 = file2.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
            OooO0O0.C19159OooO00o c19159OooO00o2 = new OooO0O0.C19159OooO00o(absolutePath2, name2);
            C33781o00o0O c33781o00o0O42 = oooO00o.f70706OooOoO;
            OooO0O0 oooO0O02 = new OooO0O0(companion2.getRootDirPath(diskVendor2), com.facebook.soloader.OooOo.OooO0oO(c19159OooO00o2));
            c33781o00o0O42.getClass();
            c33781o00o0O42.OooOO0(null, oooO0O02);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$selectNetDiskVendor$1", m80623f = "CloudBackupViewModel.kt", m80624l = {537}, m80625m = "invokeSuspend")
    public static final class C23007OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BackupFile.DiskVendor f70745OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70746OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooO00o f70747OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23007OooO0oo(BackupFile.DiskVendor diskVendor, OooO00o oooO00o, Continuation<? super C23007OooO0oo> continuation) {
            super(2, continuation);
            this.f70745OooOo = diskVendor;
            this.f70747OooOoO0 = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23007OooO0oo(this.f70745OooOo, this.f70747OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23007OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70746OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "CloudBackupViewModel", "selectNetDiskVendor, vendor: ");
                BackupFile.DiskVendor diskVendor = this.f70745OooOo;
                sbOooO0O0.append(diskVendor);
                c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                C27351Oooo0O0 c27351Oooo0O0 = this.f70747OooOoO0.f70688OooO0o0;
                this.f70746OooOo0o = 1;
                if (c27351Oooo0O0.OooOoO(diskVendor, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOO0 implements InterfaceC33721OooO0o<List<? extends C31047OooOOoo>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f70748OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOO0$OooO00o, reason: collision with other inner class name */
        public static final class C19160OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f70749OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$special$$inlined$map$1$2", m80623f = "CloudBackupViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19161OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f70750OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f70751OooOo0o;

                public C19161OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f70751OooOo0o = obj;
                    this.f70750OooOo |= Integer.MIN_VALUE;
                    return C19160OooO00o.this.emit(null, this);
                }
            }

            public C19160OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f70749OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19161OooO00o c19161OooO00o;
                if (continuation instanceof C19161OooO00o) {
                    c19161OooO00o = (C19161OooO00o) continuation;
                    int i = c19161OooO00o.f70750OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19161OooO00o.f70750OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19161OooO00o = new C19161OooO00o(continuation);
                    }
                }
                Object obj2 = c19161OooO00o.f70751OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19161OooO00o.f70750OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Integer num = (Integer) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95007OooO0o0);
                    int iIntValue = num != null ? num.intValue() : BackupFile.DiskVendor.None.ordinal();
                    List<BackupFile.DiskVendor> list = C31114OooO.f111023OooOoo0;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    for (BackupFile.DiskVendor diskVendor : list) {
                        arrayList.add(new C31047OooOOoo(diskVendor, diskVendor.ordinal() == iIntValue));
                    }
                    c19161OooO00o.f70750OooOo = 1;
                    if (this.f70749OooOo0o.emit(arrayList, c19161OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOO0(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f70748OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends C31047OooOOoo>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f70748OooOo0o.collect(new C19160OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOO0O implements InterfaceC33721OooO0o<OooO0OO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f70753OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOO0O$OooO00o, reason: collision with other inner class name */
        public static final class C19162OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f70754OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$special$$inlined$map$2$2", m80623f = "CloudBackupViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19163OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f70755OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f70756OooOo0o;

                public C19163OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f70756OooOo0o = obj;
                    this.f70755OooOo |= Integer.MIN_VALUE;
                    return C19162OooO00o.this.emit(null, this);
                }
            }

            public C19162OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f70754OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19163OooO00o c19163OooO00o;
                if (continuation instanceof C19163OooO00o) {
                    c19163OooO00o = (C19163OooO00o) continuation;
                    int i = c19163OooO00o.f70755OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19163OooO00o.f70755OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19163OooO00o = new C19163OooO00o(continuation);
                    }
                }
                Object obj2 = c19163OooO00o.f70756OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19163OooO00o.f70755OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Long l = (Long) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95006OooO0o);
                    long jLongValue = l != null ? l.longValue() : 0L;
                    OooO0OO oooO0OO = jLongValue == 0 ? OooO0OO.f70732OooOo0o : jLongValue == -1 ? OooO0OO.f70734OooOoO0 : OooO0OO.f70731OooOo;
                    c19163OooO00o.f70755OooOo = 1;
                    if (this.f70754OooOo0o.emit(oooO0OO, c19163OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOO0O(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f70753OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super OooO0OO> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f70753OooOo0o.collect(new C19162OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOO0o, reason: case insensitive filesystem */
    public static final class C23008OooOO0o implements InterfaceC33721OooO0o<BackupFile.DiskVendor> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f70758OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOO0o$OooO00o, reason: collision with other inner class name */
        public static final class C19164OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f70759OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$special$$inlined$map$3$2", m80623f = "CloudBackupViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19165OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f70760OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f70761OooOo0o;

                public C19165OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f70761OooOo0o = obj;
                    this.f70760OooOo |= Integer.MIN_VALUE;
                    return C19164OooO00o.this.emit(null, this);
                }
            }

            public C19164OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f70759OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19165OooO00o c19165OooO00o;
                T next;
                if (continuation instanceof C19165OooO00o) {
                    c19165OooO00o = (C19165OooO00o) continuation;
                    int i = c19165OooO00o.f70760OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19165OooO00o.f70760OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19165OooO00o = new C19165OooO00o(continuation);
                    }
                }
                Object obj2 = c19165OooO00o.f70761OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19165OooO00o.f70760OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Iterator<T> it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        C31047OooOOoo c31047OooOOoo = (C31047OooOOoo) next;
                        if (c31047OooOOoo.f110852OooO0O0) {
                            if (c31047OooOOoo.f110851OooO00o != BackupFile.DiskVendor.None) {
                                break;
                            }
                        }
                    }
                    C31047OooOOoo c31047OooOOoo2 = next;
                    BackupFile.DiskVendor diskVendor = c31047OooOOoo2 != null ? c31047OooOOoo2.f110851OooO00o : null;
                    c19165OooO00o.f70760OooOo = 1;
                    if (this.f70759OooOo0o.emit(diskVendor, c19165OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23008OooOO0o(C33769Ooooo0o c33769Ooooo0o) {
            this.f70758OooOo0o = c33769Ooooo0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super BackupFile.DiskVendor> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f70758OooOo0o.f121747OooOo0o.collect(new C19164OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$vendorAuthError$1$1", m80623f = "CloudBackupViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super Boolean>, Continuation<? super C32460OooOooO>, Object> {
        public OooOOO() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOO(2, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOOO0 implements InterfaceC33721OooO0o<Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f70763OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOOO0$OooO00o, reason: collision with other inner class name */
        public static final class C19166OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f70764OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$special$$inlined$map$4$2", m80623f = "CloudBackupViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19167OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f70765OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f70766OooOo0o;

                public C19167OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f70766OooOo0o = obj;
                    this.f70765OooOo |= Integer.MIN_VALUE;
                    return C19166OooO00o.this.emit(null, this);
                }
            }

            public C19166OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f70764OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19167OooO00o c19167OooO00o;
                Integer num;
                if (continuation instanceof C19167OooO00o) {
                    c19167OooO00o = (C19167OooO00o) continuation;
                    int i = c19167OooO00o.f70765OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19167OooO00o.f70765OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19167OooO00o = new C19167OooO00o(continuation);
                    }
                }
                Object obj2 = c19167OooO00o.f70766OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19167OooO00o.f70765OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List list = (List) obj;
                    if (list == null) {
                        num = new Integer(0);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (T t : list) {
                            if (((C31055OooOoOO) t).f110872OooO0o) {
                                arrayList.add(t);
                            }
                        }
                        int size = arrayList.size();
                        num = new Integer(size != 0 ? size == list.size() ? 2 : 1 : 0);
                    }
                    c19167OooO00o.f70765OooOo = 1;
                    if (this.f70764OooOo0o.emit(num, c19167OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOO0(C33769Ooooo0o c33769Ooooo0o) {
            this.f70763OooOo0o = c33769Ooooo0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f70763OooOo0o.f121747OooOo0o.collect(new C19166OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOOOO implements InterfaceC33721OooO0o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f70768OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOOOO$OooO00o, reason: collision with other inner class name */
        public static final class C19168OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f70769OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.OooO00o$OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$vendorAuthError$lambda$5$$inlined$map$1$2", m80623f = "CloudBackupViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19169OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f70770OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f70771OooOo0o;

                public C19169OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f70771OooOo0o = obj;
                    this.f70770OooOo |= Integer.MIN_VALUE;
                    return C19168OooO00o.this.emit(null, this);
                }
            }

            public C19168OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f70769OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19169OooO00o c19169OooO00o;
                if (continuation instanceof C19169OooO00o) {
                    c19169OooO00o = (C19169OooO00o) continuation;
                    int i = c19169OooO00o.f70770OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19169OooO00o.f70770OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19169OooO00o = new C19169OooO00o(continuation);
                    }
                }
                Object obj2 = c19169OooO00o.f70771OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19169OooO00o.f70770OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    c19169OooO00o.f70770OooOo = 1;
                    if (this.f70769OooOo0o.emit(boolValueOf, c19169OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOOO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f70768OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f70768OooOo0o.collect(new C19168OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO00o(Context context, C27351Oooo0O0 backupUseCase, C27570o00oOoo0 c27570o00oOoo0, C27597o00ooo00 vipFeatureUseCase, o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backupUseCase, "backupUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f70686OooO0Oo = context;
        this.f70688OooO0o0 = backupUseCase;
        this.f70687OooO0o = c27570o00oOoo0;
        this.f70689OooO0oO = vipFeatureUseCase;
        this.f70690OooO0oo = dataStore;
        o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(context);
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOoooooO, "getInstance(...)");
        this.f70685OooO = oooOO0OOoooooO;
        this.f70692OooOO0O = C25252OooO0Oo.OooOoO0(backupUseCase.f95243OooO0oo.OooO(), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f70693OooOO0o = c33781o00o0OOooO00o;
        this.f70695OooOOO0 = c33781o00o0OOooO00o;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f70694OooOOO = c33772OooooOoOooO0O0;
        this.f70696OooOOOO = c33772OooooOoOooO0O0;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(Float.valueOf(0.01f));
        this.f70697OooOOOo = c33781o00o0OOooO00o2;
        this.f70699OooOOo0 = c33781o00o0OOooO00o2;
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f70698OooOOo = c33772OooooOoOooO0O02;
        this.f70700OooOOoo = c33772OooooOoOooO0O02;
        C33772OooooOo c33772OooooOoOooO0O03 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f70703OooOo00 = c33772OooooOoOooO0O03;
        this.f70702OooOo0 = c33772OooooOoOooO0O03;
        C33772OooooOo c33772OooooOoOooO0O04 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f70704OooOo0O = c33772OooooOoOooO0O04;
        this.f70705OooOo0o = c33772OooooOoOooO0O04;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new OooOO0(dataStore.getData()), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), C34434OooOoO.f123453OooOo0o);
        this.f70701OooOo = c33769Ooooo0oOooOoO0;
        C25252OooO0Oo.OooOoO0(new OooOO0O(dataStore.getData()), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), OooO0OO.f70732OooOo0o);
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new OooO(null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        Boolean bool = Boolean.FALSE;
        this.f70707OooOoO0 = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, bool);
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(OooO0O0.f70726OooO0OO);
        this.f70706OooOoO = c33781o00o0OOooO00o3;
        this.f70708OooOoOO = c33781o00o0OOooO00o3;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(null);
        this.f70710OooOoo0 = c33781o00o0OOooO00o4;
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(C34438OooOoo0.f123458OooOo0o);
        this.f70709OooOoo = c33781o00o0OOooO00o5;
        C33781o00o0O c33781o00o0OOooO00o6 = C33784o00ooo.OooO00o("");
        this.f70711OooOooO = c33781o00o0OOooO00o6;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33781o00o0OOooO00o4, c33781o00o0OOooO00o3, c33781o00o0OOooO00o6, c33781o00o0OOooO00o5, new OooO0o(5, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f70712OooOooo = c33769Ooooo0oOooOoO02;
        this.f70714Oooo000 = C25252OooO0Oo.OooOoO0(new C23008OooOO0o(c33769Ooooo0oOooOoO0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f70715Oooo00O = C25252OooO0Oo.OooOoO0(new OooOOO0(c33769Ooooo0oOooOoO02), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        this.f70716Oooo00o = C33784o00ooo.OooO00o(bool);
        this.f70713Oooo0 = new C23004OooO0Oo();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), ExecutorC33873OooO0O0.f122045OooOoO0, null, new C19156OooO00o(null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(OooO00o oooO00o, Integer num, Continuation continuation) {
        C31133OooOOoo c31133OooOOoo;
        oooO00o.getClass();
        if (continuation instanceof C31133OooOOoo) {
            c31133OooOOoo = (C31133OooOOoo) continuation;
            int i = c31133OooOOoo.f111093OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c31133OooOOoo.f111093OooOoO = i - Integer.MIN_VALUE;
            } else {
                c31133OooOOoo = new C31133OooOOoo(oooO00o, continuation);
            }
        }
        Object objOooOOo = c31133OooOOoo.f111091OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c31133OooOOoo.f111093OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            oooO00o.OooO0oo();
            if (num != null) {
                if (num.intValue() != BackupFile.DiskVendor.None.ordinal()) {
                    C22916Oooo0oO c22916Oooo0oOOooO = oooO00o.f70688OooO0o0.f95243OooO0oo.OooO();
                    c31133OooOOoo.f111092OooOo0o = oooO00o;
                    c31133OooOOoo.f111093OooOoO = 1;
                    objOooOOo = C25252OooO0Oo.OooOOo(c22916Oooo0oOOooO, c31133OooOOoo);
                    if (objOooOOo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
            }
            Log.i("CloudBackupViewModel", "Cancel unique work(CloudBackupWorker).");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudBackupViewModel");
            c20358OooO00o.OooO0o0("checkCloudBackupWorkInternal, vendorOrdinal is null or None, cancel unique work(CloudBackupWorker).", new Object[0]);
            o00O0OO0.OooOO0O oooOO0O = oooO00o.f70685OooO;
            oooOO0O.getClass();
            oooOO0O.f84363OooO0Oo.OooO00o(new C24895OooO0O0(oooOO0O, "CloudBackupWorker", true));
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oooO00o = c31133OooOOoo.f111092OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        int iIntValue = ((Number) objOooOOo).intValue();
        EnumC24838OooOO0o enumC24838OooOO0o = iIntValue == 0 ? EnumC24838OooOO0o.f84260OooOoO0 : EnumC24838OooOO0o.f84257OooOo;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o2, "CloudBackupViewModel", "checkCloudBackupWorkInternal, backupMode: ", iIntValue, ", networkType: ");
        sbOooO00o.append(enumC24838OooOO0o);
        c20358OooO00o2.OooO0o0(sbOooO00o.toString(), new Object[0]);
        EnumC24838OooOO0o enumC24838OooOO0o2 = EnumC24838OooOO0o.f84258OooOo0o;
        C24834OooO0Oo c24834OooO0Oo = new C24834OooO0Oo();
        o00O0O0o.OooO0OO oooO0OO = new o00O0O0o.OooO0OO();
        oooO0OO.f84232OooO00o = enumC24838OooOO0o2;
        oooO0OO.f84236OooO0o = -1L;
        oooO0OO.f84238OooO0oO = -1L;
        new C24834OooO0Oo();
        oooO0OO.f84233OooO0O0 = false;
        oooO0OO.f84234OooO0OO = false;
        oooO0OO.f84232OooO00o = enumC24838OooOO0o;
        oooO0OO.f84235OooO0Oo = false;
        oooO0OO.f84237OooO0o0 = false;
        oooO0OO.f84239OooO0oo = c24834OooO0Oo;
        oooO0OO.f84236OooO0o = -1L;
        oooO0OO.f84238OooO0oO = -1L;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C24839OooOOOo.OooO00o oooO00o2 = new C24839OooOOOo.OooO00o(CloudBackupWorker.class);
        C24880OooOOoo c24880OooOOoo = oooO00o2.f84274OooO0O0;
        long millis = timeUnit.toMillis(30L);
        c24880OooOOoo.getClass();
        long j = 900000;
        String str = C24880OooOOoo.f84454OooOOoo;
        if (millis < 900000) {
            o00O0O0o.OooOO0O.OooO0OO().OooO0o(str, "Interval duration lesser than minimum allowed value; Changed to 900000", new Throwable[0]);
            millis = 900000;
        }
        if (millis < 900000) {
            o00O0O0o.OooOO0O.OooO0OO().OooO0o(str, "Interval duration lesser than minimum allowed value; Changed to 900000", new Throwable[0]);
        } else {
            j = millis;
        }
        if (millis < 300000) {
            o00O0O0o.OooOO0O.OooO0OO().OooO0o(str, "Flex duration lesser than minimum allowed value; Changed to 300000", new Throwable[0]);
            millis = 300000;
        }
        if (millis > j) {
            o00O0O0o.OooOO0O.OooO0OO().OooO0o(str, androidx.concurrent.futures.OooO00o.OooO0O0(j, "Flex duration greater than interval duration; Changed to "), new Throwable[0]);
            millis = j;
        }
        c24880OooOOoo.f84464OooO0oo = j;
        c24880OooOOoo.f84456OooO = millis;
        oooO00o2.f84274OooO0O0.f84463OooO0oO = TimeUnit.SECONDS.toMillis(30L);
        long jCurrentTimeMillis = LocationRequestCompat.PASSIVE_INTERVAL - System.currentTimeMillis();
        C24880OooOOoo c24880OooOOoo2 = oooO00o2.f84274OooO0O0;
        if (jCurrentTimeMillis <= c24880OooOOoo2.f84463OooO0oO) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
        c24880OooOOoo2.f84465OooOO0 = oooO0OO;
        C24839OooOOOo c24839OooOOOoOooO00o = oooO00o2.OooO00o();
        o00O0OO0.OooOO0O oooOO0O2 = oooO00o.f70685OooO;
        oooOO0O2.getClass();
        new C24847OooO0oO(oooOO0O2, "CloudBackupWorker", o00O0O0o.OooO0o.f84243OooOo, Collections.singletonList(c24839OooOOOoOooO00o)).Oooo();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinkedHashMap OooO0o0(OooO00o oooO00o, ArrayList arrayList, BackupFile.DiskVendor diskVendor) {
        long jLongValue;
        String displayName;
        Long l;
        String str;
        String str2;
        oooO00o.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        BackupFile.DiskVendor diskVendor2 = diskVendor;
        String rootDirPath = BackupFile.INSTANCE.getRootDirPath(diskVendor2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BackupFile backupFile = (BackupFile) it.next();
            Map<String, String> contentProperties = backupFile.getContentProperties();
            String str3 = contentProperties.get(BackupFile.FILE_PROPERTY_CONTENT_USER_ID);
            if (str3 != null && (str = contentProperties.get(BackupFile.FILE_PROPERTY_CONTENT_DEVICE_NAME)) != null && (str2 = contentProperties.get(BackupFile.FILE_PROPERTY_CONTENT_APP_INSTANCE_ID)) != null) {
                BackupInstance backupInstance = new BackupInstance(str2, str3, str);
                String backupInstanceDirName = backupInstance.toBackupInstanceDirName();
                String str4 = rootDirPath + File.separator + backupInstanceDirName;
                linkedHashMap2.put(str4, backupInstance);
                if (!linkedHashMap.containsKey(str4)) {
                    linkedHashMap.put(str4, new ArrayList());
                }
                List list = (List) linkedHashMap.get(str4);
                if (list != null) {
                    list.add(backupFile);
                }
            }
        }
        linkedHashMap.put(rootDirPath, new ArrayList());
        Set setKeySet = linkedHashMap.keySet();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0((String) obj, rootDirPath)) {
                arrayList2.add(obj);
            }
        }
        for (String str5 : arrayList2) {
            List list2 = (List) linkedHashMap.get(str5);
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                if (it2.hasNext()) {
                    Long lValueOf = Long.valueOf(((BackupFile) it2.next()).getCreationTime());
                    while (it2.hasNext()) {
                        Long lValueOf2 = Long.valueOf(((BackupFile) it2.next()).getCreationTime());
                        if (lValueOf.compareTo(lValueOf2) < 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                    l = lValueOf;
                } else {
                    l = null;
                }
                jLongValue = l != null ? l.longValue() : 0L;
            }
            long j = jLongValue;
            BackupInstance backupInstance2 = (BackupInstance) linkedHashMap2.get(str5);
            if (backupInstance2 != null && (displayName = backupInstance2.getDisplayName(oooO00o.f70686OooO0Oo)) != null) {
                BackupFile backupFile2 = new BackupFile(C24761OooO.OooO00o("toString(...)"), diskVendor2, displayName, str5, true, j, 0L, C34436OooOoOO.f123455OooOo0o, null);
                List list3 = (List) linkedHashMap.get(rootDirPath);
                if (list3 != null) {
                    list3.add(backupFile2);
                }
            }
            diskVendor2 = diskVendor;
        }
        return linkedHashMap;
    }

    public static final Object OooO0oO(OooO00o oooO00o, BackupException backupException, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        Object next;
        oooO00o.getClass();
        if (backupException.getErrorCode() == -101) {
            oooO00o.OooOO0o(BackupFile.DiskVendor.None);
            Iterator it = ((Iterable) oooO00o.f70701OooOo.f121747OooOo0o.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C31047OooOOoo) next).f110852OooO0O0) {
                    break;
                }
            }
            C31047OooOOoo c31047OooOOoo = (C31047OooOOoo) next;
            BackupFile.DiskVendor diskVendor = c31047OooOOoo != null ? c31047OooOOoo.f110851OooO00o : null;
            if (diskVendor != null) {
                C27351Oooo0O0 c27351Oooo0O0 = oooO00o.f70688OooO0o0;
                c27351Oooo0O0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27335OooOOo(diskVendor, null, c27351Oooo0O0), abstractC32476OooO);
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO0o != enumC32485OooO00o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        if (r13 == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C31136OooOo00 c31136OooOo00;
        ArrayList arrayList;
        OooO00o oooO00o;
        List list;
        List list2;
        OooO00o oooO00o2;
        List list3;
        if (abstractC32479OooO0OO instanceof C31136OooOo00) {
            c31136OooOo00 = (C31136OooOo00) abstractC32479OooO0OO;
            int i = c31136OooOo00.f111104OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c31136OooOo00.f111104OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c31136OooOo00 = new C31136OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c31136OooOo00.f111101OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c31136OooOo00.f111104OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            Map map = (Map) this.f70710OooOoo0.getValue();
            if (map == null) {
                return new Integer(9);
            }
            ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00(map.values());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListOooOo00) {
                if (((Set) this.f70709OooOoo.getValue()).contains(((BackupFile) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (C32501OooO0oO.OooO0o0(new File(((BackupFile) obj2).getPath())).equals("template")) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                c31136OooOo00.f111100OooOo0o = this;
                c31136OooOo00.f111099OooOo = arrayList2;
                c31136OooOo00.f111102OooOoO0 = arrayList;
                c31136OooOo00.f111104OooOoo0 = 1;
                objOooO0o = this.f70689OooO0oO.OooO0o(1, c31136OooOo00);
                if (objOooO0o != enumC32485OooO00o) {
                    oooO00o = this;
                    list3 = arrayList2;
                }
                return enumC32485OooO00o;
            }
            oooO00o = this;
            list = arrayList2;
            C27570o00oOoo0 c27570o00oOoo0 = oooO00o.f70687OooO0o;
            int size = arrayList.size();
            c31136OooOo00.f111100OooOo0o = oooO00o;
            c31136OooOo00.f111099OooOo = list;
            c31136OooOo00.f111102OooOoO0 = null;
            c31136OooOo00.f111104OooOoo0 = 2;
            objOooO0o = c27570o00oOoo0.OooO0O0(size, c31136OooOo00);
            if (objOooO0o != enumC32485OooO00o) {
                list2 = list;
                oooO00o2 = oooO00o;
                if (((Boolean) objOooO0o).booleanValue()) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0o);
                if (((Number) objOooO0o).intValue() != 0) {
                    return new Integer(3);
                }
                return new Integer(0);
            }
            List list4 = c31136OooOo00.f111099OooOo;
            oooO00o2 = c31136OooOo00.f111100OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            list2 = list4;
            if (((Boolean) objOooO0o).booleanValue()) {
                return new Integer(0);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (C32501OooO0oO.OooO0o0(new File(((BackupFile) obj3).getPath())).equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList3.isEmpty()) {
                C27597o00ooo00 c27597o00ooo00 = oooO00o2.f70689OooO0oO;
                int size2 = arrayList3.size();
                c31136OooOo00.f111100OooOo0o = null;
                c31136OooOo00.f111099OooOo = null;
                c31136OooOo00.f111104OooOoo0 = 3;
                objOooO0o = c27597o00ooo00.OooO0OO(size2, c31136OooOo00);
            }
            return new Integer(0);
        }
        arrayList = c31136OooOo00.f111102OooOoO0;
        List list5 = c31136OooOo00.f111099OooOo;
        oooO00o = c31136OooOo00.f111100OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        list3 = list5;
        list = list3;
        if (((Number) objOooO0o).intValue() != 0) {
            return new Integer(1);
        }
        C27570o00oOoo0 c27570o00oOoo02 = oooO00o.f70687OooO0o;
        int size3 = arrayList.size();
        c31136OooOo00.f111100OooOo0o = oooO00o;
        c31136OooOo00.f111099OooOo = list;
        c31136OooOo00.f111102OooOoO0 = null;
        c31136OooOo00.f111104OooOoo0 = 2;
        objOooO0o = c27570o00oOoo02.OooO0O0(size3, c31136OooOo00);
        if (objOooO0o != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }

    public final void OooO0oo() {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23005OooO0o0(null), 2);
    }

    public final void OooOO0() {
        this.f70710OooOoo0.setValue(null);
        this.f70706OooOoO.setValue(OooO0O0.f70726OooO0OO);
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        C33781o00o0O c33781o00o0O = this.f70709OooOoo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, c34438OooOoo0);
        C33781o00o0O c33781o00o0O2 = this.f70711OooOooO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, "");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C23006OooO0oO(null), 3);
    }

    public final void OooOO0O(boolean z) {
        String str;
        Map map = (Map) this.f70710OooOoo0.getValue();
        if (map == null) {
            return;
        }
        Object objO0OO00O = C34438OooOoo0.f123458OooOo0o;
        C33781o00o0O c33781o00o0O = this.f70709OooOoo;
        if (!z) {
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, objO0OO00O);
            return;
        }
        OooO0O0 oooO0O0 = (OooO0O0) this.f70706OooOoO.getValue();
        OooO0O0.C19159OooO00o c19159OooO00o = (OooO0O0.C19159OooO00o) OooOo.OoooOo0(oooO0O0.f70728OooO0O0);
        if (c19159OooO00o == null || (str = c19159OooO00o.f70729OooO00o) == null || str.equals(oooO0O0.f70727OooO00o)) {
            return;
        }
        List list = (List) map.get(str);
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BackupFile) it.next()).getId());
            }
            objO0OO00O = OooOo.o0OO00O(arrayList);
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, objO0OO00O);
    }

    public final void OooOO0o(BackupFile.DiskVendor vendor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(vendor, "vendor");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C23007OooO0oo(vendor, this, null), 3);
    }

    public final void OooOOO0(String folderPath) {
        Collection collectionValues;
        Object next;
        List listOooOO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(folderPath, "folderPath");
        C33781o00o0O c33781o00o0O = this.f70706OooOoO;
        OooO0O0 oooO0O0 = (OooO0O0) c33781o00o0O.getValue();
        String str = oooO0O0.f70727OooO00o;
        String root = oooO0O0.f70727OooO00o;
        String name = new File(root).getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
        OooO0O0.C19159OooO00o c19159OooO00o = new OooO0O0.C19159OooO00o(str, name);
        if (folderPath.equals(root)) {
            listOooOO0o = com.facebook.soloader.OooOo.OooO0oO(c19159OooO00o);
        } else {
            Map map = (Map) this.f70710OooOoo0.getValue();
            if (map == null || (collectionValues = map.values()) == null) {
                return;
            }
            Iterator it = C34428OooOOo.OooOo00(collectionValues).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((BackupFile) next).getPath(), folderPath)) {
                        break;
                    }
                }
            }
            BackupFile backupFile = (BackupFile) next;
            if (backupFile == null) {
                return;
            } else {
                listOooOO0o = C34429OooOOo0.OooOO0o(c19159OooO00o, new OooO0O0.C19159OooO00o(backupFile.getPath(), backupFile.getName()));
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(root, "root");
        OooO0O0 oooO0O02 = new OooO0O0(root, listOooOO0o);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO0O02);
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        C33781o00o0O c33781o00o0O2 = this.f70709OooOoo;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, c34438OooOoo0);
    }
}
