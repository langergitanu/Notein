package o0OOo0o;

import android.graphics.RectF;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.Image;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00Oo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$updateDualLinkRef$2", m80623f = "NoteUseCase.kt", m80624l = {532, 535, 541}, m80625m = "invokeSuspend")
public final class C27478o00Oo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27449o00O0OoO f96274OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public RectF f96275OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f96276OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f96277OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public DualLinkRef f96278OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f96279OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f96280OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f96281OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96282OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ RectF f96283Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f96284Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ String f96285Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ String f96286Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ String f96287Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ float f96288Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f96289Oooo0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27478o00Oo00o(C27449o00O0OoO c27449o00O0OoO, String str, String str2, String str3, RectF rectF, String str4, float f, boolean z, Continuation<? super C27478o00Oo00o> continuation) {
        super(2, continuation);
        this.f96282OooOooo = c27449o00O0OoO;
        this.f96284Oooo000 = str;
        this.f96285Oooo00O = str2;
        this.f96286Oooo00o = str3;
        this.f96283Oooo0 = rectF;
        this.f96287Oooo0O0 = str4;
        this.f96288Oooo0OO = f;
        this.f96289Oooo0o0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27478o00Oo00o(this.f96282OooOooo, this.f96284Oooo000, this.f96285Oooo00O, this.f96286Oooo00o, this.f96283Oooo0, this.f96287Oooo0O0, this.f96288Oooo0OO, this.f96289Oooo0o0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27478o00Oo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
    
        if (r4.OooOOoo(r3, r2, r28) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0oo;
        C27449o00O0OoO c27449o00O0OoO;
        DualLinkRef dualLinkRef;
        String str;
        float f;
        boolean z;
        RectF rectF;
        Image item;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96281OooOooO;
        String str2 = this.f96285Oooo00O;
        C27449o00O0OoO c27449o00O0OoO2 = this.f96282OooOooo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26515OooooO0 c26515OooooO0 = c27449o00O0OoO2.f96052OooOOoo;
            this.f96281OooOooO = 1;
            objOooO0oo = c26515OooooO0.OooO0oo(this.f96284Oooo000, str2, this);
            if (objOooO0oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            boolean z2 = this.f96279OooOoo;
            float f2 = this.f96280OooOoo0;
            dualLinkRef = this.f96278OooOoOO;
            String str3 = this.f96276OooOoO;
            String str4 = this.f96277OooOoO0;
            c27449o00O0OoO = this.f96274OooOo;
            RectF rectF2 = this.f96275OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            z = z2;
            f = f2;
            str = str3;
            str2 = str4;
            rectF = rectF2;
            item = dualLinkRef.getItem();
            if (item != null) {
                Image imageCopy$default = Image.copy$default(item, item.getId(), null, str, null, rectF, f, 0L, 0L, z, 202, null);
                C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(imageCopy$default);
                this.f96275OooOo0o = null;
                this.f96274OooOo = null;
                this.f96277OooOoO0 = null;
                this.f96276OooOoO = null;
                this.f96278OooOoOO = null;
                this.f96281OooOooO = 3;
            }
            return null;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0oo = obj;
        DualLinkRef dualLinkRef2 = (DualLinkRef) objOooO0oo;
        if (dualLinkRef2 != null) {
            RectF rectF3 = this.f96283Oooo0;
            DualLinkRef dualLinkRefCopy$default = DualLinkRef.copy$default(dualLinkRef2, null, null, this.f96286Oooo00o, rectF3, null, null, false, 0L, 0L, 499, null);
            C26515OooooO0 c26515OooooO02 = c27449o00O0OoO2.f96052OooOOoo;
            this.f96275OooOo0o = rectF3;
            this.f96274OooOo = c27449o00O0OoO2;
            this.f96277OooOoO0 = str2;
            String str5 = this.f96287Oooo0O0;
            this.f96276OooOoO = str5;
            this.f96278OooOoOO = dualLinkRef2;
            float f3 = this.f96288Oooo0OO;
            this.f96280OooOoo0 = f3;
            boolean z3 = this.f96289Oooo0o0;
            this.f96279OooOoo = z3;
            this.f96281OooOooO = 2;
            if (c26515OooooO02.OooOOOO(dualLinkRefCopy$default, this) != enumC32485OooO00o) {
                c27449o00O0OoO = c27449o00O0OoO2;
                dualLinkRef = dualLinkRef2;
                str = str5;
                f = f3;
                z = z3;
                rectF = rectF3;
                item = dualLinkRef.getItem();
                if (item != null) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }
}
