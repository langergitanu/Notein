package o0oOoo00;

import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27351Oooo0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOoo00.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$recoverBackupFiles$2", m80623f = "CloudBackupViewModel.kt", m80624l = {492}, m80625m = "invokeSuspend")
public final class C31140OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f111110OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111111OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.backup.OooO00o f111112OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31140OooOoO0(ArrayList arrayList, com.orion.notein.p607ui.backup.OooO00o oooO00o, Continuation continuation) {
        super(2, continuation);
        this.f111110OooOo = arrayList;
        this.f111112OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31140OooOoO0(this.f111110OooOo, this.f111112OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31140OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111111OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ArrayList arrayList = this.f111110OooOo;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (C32501OooO0oO.OooO0o0(new File(((BackupFile) obj2).getName())).equals("template")) {
                        arrayList2.add(obj2);
                    }
                }
                C27351Oooo0O0 c27351Oooo0O0 = this.f111112OooOoO0.f70688OooO0o0;
                this.f111111OooOo0o = 1;
                if (c27351Oooo0O0.OooOoO0(arrayList2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudBackupViewModel");
            e.printStackTrace();
            c20358OooO00o.OooO0OO("Unable to recover backup files. " + C32460OooOooO.f116667OooO00o, new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
