package o0OOoo0O;

import Oooo0oO.o0Oo0oo;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO0ooO.C26961OooOO0;
import o0OO0ooO.C26962OooOO0O;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOo0Oo.InterfaceC27310OooOoO0;
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

/* JADX INFO: renamed from: o0OOoo0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.DownloadMaterialUseCase$execute$1", m80623f = "DownloadMaterialUseCase.kt", m80624l = {32, 35, 38, 44, 49, 58}, m80625m = "invokeSuspend")
public final class C27847OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super DownloadResult>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f98378OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Material f98379OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27852OooOo00 f98380OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98381OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98382OooOoOO;

    /* JADX INFO: renamed from: o0OOoo0O.OooOOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Material f98383OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27852OooOo00 f98384OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<DownloadResult> f98385OooOoO0;

        /* JADX INFO: renamed from: o0OOoo0O.OooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.DownloadMaterialUseCase$execute$1$1", m80623f = "DownloadMaterialUseCase.kt", m80624l = {61, 74}, m80625m = "emit")
        public static final class C19874OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public DownloadResult f98386OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public OooO00o f98387OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f98388OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public /* synthetic */ Object f98389OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public int f98390OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19874OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C19874OooO00o> continuation) {
                super(continuation);
                this.f98388OooOoO = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f98389OooOoO0 = obj;
                this.f98390OooOoOO |= Integer.MIN_VALUE;
                return this.f98388OooOoO.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C27852OooOo00 c27852OooOo00, Material material, InterfaceC33723OooO0oO<? super DownloadResult> interfaceC33723OooO0oO) {
            this.f98384OooOo0o = c27852OooOo00;
            this.f98383OooOo = material;
            this.f98385OooOoO0 = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        
            if (r2.f98385OooOoO0.emit(r8, r0) != r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(DownloadResult downloadResult, Continuation<? super C32460OooOooO> continuation) {
            C19874OooO00o c19874OooO00o;
            OooO00o<T> oooO00o;
            if (continuation instanceof C19874OooO00o) {
                c19874OooO00o = (C19874OooO00o) continuation;
                int i = c19874OooO00o.f98390OooOoOO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19874OooO00o.f98390OooOoOO = i - Integer.MIN_VALUE;
                } else {
                    c19874OooO00o = new C19874OooO00o(this, continuation);
                }
            }
            Object obj = c19874OooO00o.f98389OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19874OooO00o.f98390OooOoOO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if ((downloadResult instanceof DownloadResult.Success) || (downloadResult instanceof DownloadResult.NoFileNeeded)) {
                    InterfaceC27304OooOo interfaceC27304OooOo = this.f98384OooOo0o.f98419OooO0O0;
                    c19874OooO00o.f98387OooOo0o = this;
                    c19874OooO00o.f98386OooOo = downloadResult;
                    c19874OooO00o.f98390OooOoOO = 1;
                    if (interfaceC27304OooOo.OooO0OO(downloadResult, c19874OooO00o) != enumC32485OooO00o) {
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
                c19874OooO00o.f98387OooOo0o = null;
                c19874OooO00o.f98386OooOo = null;
                c19874OooO00o.f98390OooOoOO = 2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                downloadResult = c19874OooO00o.f98386OooOo;
                oooO00o = c19874OooO00o.f98387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Material downloaded successfully: ", oooO00o.f98383OooOo.getTitle()), new Object[0]);
            c19874OooO00o.f98387OooOo0o = null;
            c19874OooO00o.f98386OooOo = null;
            c19874OooO00o.f98390OooOoOO = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27847OooOOo(C27852OooOo00 c27852OooOo00, String str, Continuation<? super C27847OooOOo> continuation) {
        super(2, continuation);
        this.f98380OooOoO = c27852OooOo00;
        this.f98382OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27847OooOOo c27847OooOOo = new C27847OooOOo(this.f98380OooOoO, this.f98382OooOoOO, continuation);
        c27847OooOOo.f98381OooOoO0 = obj;
        return c27847OooOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super DownloadResult> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27847OooOOo) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r3.emit(r5, r8) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r3.emit(r4, r8) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
    
        if (r9.collect(r5, r8) != r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        Object objOooO00o;
        Material material;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        DownloadResult.AuthRequired authRequiredOooO0O0;
        InterfaceC33721OooO0o<DownloadResult> interfaceC33721OooO0oDownload;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98378OooOo;
        String str = this.f98382OooOoOO;
        C27852OooOo00 c27852OooOo00 = this.f98380OooOoO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f98381OooOoO0;
                InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = c27852OooOo00.f98418OooO00o;
                this.f98381OooOoO0 = interfaceC33723OooO0oO;
                this.f98378OooOo = 1;
                obj = interfaceC27310OooOoO0.OooO0o(str, this);
                if (obj != enumC32485OooO00o) {
                    Material material2 = (Material) obj;
                    C27854OooOo0o c27854OooOo0o = c27852OooOo00.f98421OooO0Oo;
                    this.f98381OooOoO0 = interfaceC33723OooO0oO;
                    this.f98379OooOo0o = material2;
                    this.f98378OooOo = 2;
                    objOooO00o = c27854OooOo0o.OooO00o(str, this);
                    if (objOooO00o != enumC32485OooO00o) {
                        InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = interfaceC33723OooO0oO;
                        material = material2;
                        obj = objOooO00o;
                        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO3;
                        C27854OooOo0o.OooO00o oooO00o = (C27854OooOo0o.OooO00o) obj;
                        C27854OooOo0o c27854OooOo0o2 = c27852OooOo00.f98421OooO0Oo;
                        authRequiredOooO0O0 = C27854OooOo0o.OooO0O0(oooO00o, material);
                        if (authRequiredOooO0O0 == null) {
                            this.f98381OooOoO0 = null;
                            this.f98379OooOo0o = null;
                            this.f98378OooOo = 3;
                        } else if (!(oooO00o instanceof C27854OooOo0o.OooO00o.OooO0O0)) {
                            this.f98381OooOoO0 = interfaceC33723OooO0oO2;
                            this.f98379OooOo0o = material;
                            this.f98378OooOo = 5;
                            if (c27852OooOo00.f98419OooO0O0.OooO0Oo(material, this) != enumC32485OooO00o) {
                                if (material.needsFileDownload()) {
                                    interfaceC33721OooO0oDownload = material.download(null);
                                } else {
                                    C26962OooOO0O c26962OooOO0O = c27852OooOo00.f98420OooO0OO;
                                    c26962OooOO0O.getClass();
                                    C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new C26961OooOO0(material, c26962OooOO0O, null));
                                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                    interfaceC33721OooO0oDownload = C25252OooO0Oo.OooOo0O(c33770OooooO0, ExecutorC33873OooO0O0.f122045OooOoO0);
                                }
                                OooO00o oooO00o2 = new OooO00o(c27852OooOo00, material, interfaceC33723OooO0oO2);
                                this.f98381OooOoO0 = null;
                                this.f98379OooOo0o = null;
                                this.f98378OooOo = 6;
                            }
                        } else {
                            DownloadResult.Failed failed = new DownloadResult.Failed(material, ((C27854OooOo0o.OooO00o.OooO0O0) oooO00o).f98431OooO00o);
                            this.f98381OooOoO0 = null;
                            this.f98379OooOo0o = null;
                            this.f98378OooOo = 4;
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f98381OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                Material material22 = (Material) obj;
                C27854OooOo0o c27854OooOo0o3 = c27852OooOo00.f98421OooO0Oo;
                this.f98381OooOoO0 = interfaceC33723OooO0oO;
                this.f98379OooOo0o = material22;
                this.f98378OooOo = 2;
                objOooO00o = c27854OooOo0o3.OooO00o(str, this);
                if (objOooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                material = this.f98379OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f98381OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                C27854OooOo0o.OooO00o oooO00o3 = (C27854OooOo0o.OooO00o) obj;
                C27854OooOo0o c27854OooOo0o22 = c27852OooOo00.f98421OooO0Oo;
                authRequiredOooO0O0 = C27854OooOo0o.OooO0O0(oooO00o3, material);
                if (authRequiredOooO0O0 == null) {
                }
                return enumC32485OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 5:
                material = this.f98379OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f98381OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                if (material.needsFileDownload()) {
                }
                OooO00o oooO00o22 = new OooO00o(c27852OooOo00, material, interfaceC33723OooO0oO2);
                this.f98381OooOoO0 = null;
                this.f98379OooOo0o = null;
                this.f98378OooOo = 6;
                break;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
