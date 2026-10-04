package o0OOoo0O;

import Oooo0oO.o0Oo0oo;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO0ooO.C26961OooOO0;
import o0OO0ooO.C26962OooOO0O;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOoo0O.C27854OooOo0o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.DownloadMaterialUseCase$execute$2", m80623f = "DownloadMaterialUseCase.kt", m80624l = {84, 87, 93, 98, 107}, m80625m = "invokeSuspend")
public final class C27849OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super DownloadResult>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98392OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98393OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Material f98394OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27852OooOo00 f98395OooOoO0;

    /* JADX INFO: renamed from: o0OOoo0O.OooOOoo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Material f98396OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27852OooOo00 f98397OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<DownloadResult> f98398OooOoO0;

        /* JADX INFO: renamed from: o0OOoo0O.OooOOoo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.DownloadMaterialUseCase$execute$2$1", m80623f = "DownloadMaterialUseCase.kt", m80624l = {110, 123}, m80625m = "emit")
        public static final class C19875OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public DownloadResult f98399OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public OooO00o f98400OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f98401OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public /* synthetic */ Object f98402OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public int f98403OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19875OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C19875OooO00o> continuation) {
                super(continuation);
                this.f98401OooOoO = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f98402OooOoO0 = obj;
                this.f98403OooOoOO |= Integer.MIN_VALUE;
                return this.f98401OooOoO.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C27852OooOo00 c27852OooOo00, Material material, InterfaceC33723OooO0oO<? super DownloadResult> interfaceC33723OooO0oO) {
            this.f98397OooOo0o = c27852OooOo00;
            this.f98396OooOo = material;
            this.f98398OooOoO0 = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        
            if (r2.f98398OooOoO0.emit(r8, r0) != r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(DownloadResult downloadResult, Continuation<? super C32460OooOooO> continuation) {
            C19875OooO00o c19875OooO00o;
            OooO00o<T> oooO00o;
            if (continuation instanceof C19875OooO00o) {
                c19875OooO00o = (C19875OooO00o) continuation;
                int i = c19875OooO00o.f98403OooOoOO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19875OooO00o.f98403OooOoOO = i - Integer.MIN_VALUE;
                } else {
                    c19875OooO00o = new C19875OooO00o(this, continuation);
                }
            }
            Object obj = c19875OooO00o.f98402OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19875OooO00o.f98403OooOoOO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if ((downloadResult instanceof DownloadResult.Success) || (downloadResult instanceof DownloadResult.NoFileNeeded)) {
                    InterfaceC27304OooOo interfaceC27304OooOo = this.f98397OooOo0o.f98419OooO0O0;
                    c19875OooO00o.f98400OooOo0o = this;
                    c19875OooO00o.f98399OooOo = downloadResult;
                    c19875OooO00o.f98403OooOoOO = 1;
                    if (interfaceC27304OooOo.OooO0OO(downloadResult, c19875OooO00o) != enumC32485OooO00o) {
                        oooO00o = this;
                    }
                    return enumC32485OooO00o;
                }
                if (downloadResult instanceof DownloadResult.Failed) {
                    DownloadResult.Failed failed = (DownloadResult.Failed) downloadResult;
                    C34406OooO00o.f123390OooO00o.OooO0Oo(failed.getError(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to download material: ", failed.getMaterial().getTitle()), new Object[0]);
                } else if (downloadResult instanceof DownloadResult.InProgress) {
                    C34406OooO00o.f123390OooO00o.OooO00o(o0Oo0oo.OooO0O0((int) (((DownloadResult.InProgress) downloadResult).getProgress() * 100), "Download progress: ", "%"), new Object[0]);
                } else if (!(downloadResult instanceof DownloadResult.AuthRequired)) {
                    throw new C32442OooOO0o();
                }
                oooO00o = this;
                c19875OooO00o.f98400OooOo0o = null;
                c19875OooO00o.f98399OooOo = null;
                c19875OooO00o.f98403OooOoOO = 2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                downloadResult = c19875OooO00o.f98399OooOo;
                oooO00o = c19875OooO00o.f98400OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Material downloaded successfully: ", oooO00o.f98396OooOo.getTitle()), new Object[0]);
            c19875OooO00o.f98400OooOo0o = null;
            c19875OooO00o.f98399OooOo = null;
            c19875OooO00o.f98403OooOoOO = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27849OooOOoo(C27852OooOo00 c27852OooOo00, Material material, Continuation<? super C27849OooOOoo> continuation) {
        super(2, continuation);
        this.f98395OooOoO0 = c27852OooOo00;
        this.f98394OooOoO = material;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27849OooOOoo c27849OooOOoo = new C27849OooOOoo(this.f98395OooOoO0, this.f98394OooOoO, continuation);
        c27849OooOOoo.f98392OooOo = obj;
        return c27849OooOOoo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super DownloadResult> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27849OooOOoo) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r1.emit(r7, r12) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r1.emit(r3, r12) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (r13.collect(r4, r12) != r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        InterfaceC33721OooO0o<DownloadResult> interfaceC33721OooO0oDownload;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98393OooOo0o;
        C27852OooOo00 c27852OooOo00 = this.f98395OooOoO0;
        Material material = this.f98394OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f98392OooOo;
            C27854OooOo0o c27854OooOo0o = c27852OooOo00.f98421OooO0Oo;
            String id = material.getId();
            this.f98392OooOo = interfaceC33723OooO0oO2;
            this.f98393OooOo0o = 1;
            Object objOooO00o = c27854OooOo0o.OooO00o(id, this);
            if (objOooO00o != enumC32485OooO00o) {
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                obj = objOooO00o;
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f98392OooOo;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i == 3) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f98392OooOo;
            C32446OooOOOo.OooO0O0(obj);
            if (material.needsFileDownload()) {
                interfaceC33721OooO0oDownload = material.download(null);
            } else {
                C26962OooOO0O c26962OooOO0O = c27852OooOo00.f98420OooO0OO;
                c26962OooOO0O.getClass();
                C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new C26961OooOO0(material, c26962OooOO0O, null));
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                interfaceC33721OooO0oDownload = C25252OooO0Oo.OooOo0O(c33770OooooO0, ExecutorC33873OooO0O0.f122045OooOoO0);
            }
            OooO00o oooO00o = new OooO00o(c27852OooOo00, material, interfaceC33723OooO0oO);
            this.f98392OooOo = null;
            this.f98393OooOo0o = 5;
        }
        C27854OooOo0o.OooO00o oooO00o2 = (C27854OooOo0o.OooO00o) obj;
        C27854OooOo0o c27854OooOo0o2 = c27852OooOo00.f98421OooO0Oo;
        DownloadResult.AuthRequired authRequiredOooO0O0 = C27854OooOo0o.OooO0O0(oooO00o2, material);
        if (authRequiredOooO0O0 != null) {
            this.f98392OooOo = null;
            this.f98393OooOo0o = 2;
        } else if (oooO00o2 instanceof C27854OooOo0o.OooO00o.OooO0O0) {
            DownloadResult.Failed failed = new DownloadResult.Failed(material, ((C27854OooOo0o.OooO00o.OooO0O0) oooO00o2).f98431OooO00o);
            this.f98392OooOo = null;
            this.f98393OooOo0o = 3;
        } else {
            this.f98392OooOo = interfaceC33723OooO0oO;
            this.f98393OooOo0o = 4;
            if (c27852OooOo00.f98419OooO0O0.OooO0Oo(material, this) != enumC32485OooO00o) {
                if (material.needsFileDownload()) {
                }
                OooO00o oooO00o3 = new OooO00o(c27852OooOo00, material, interfaceC33723OooO0oO);
                this.f98392OooOo = null;
                this.f98393OooOo0o = 5;
            }
        }
        return enumC32485OooO00o;
    }
}
