package o0oOoo00;

import android.util.Log;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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

/* JADX INFO: renamed from: o0oOoo00.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupViewModel$recoverSelectedFiles$2", m80623f = "BackupViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6}, m80625m = "invokeSuspend")
public final class C31128OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<BackupFile> f111083OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111084OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C31114OooO f111085OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31128OooOOO0(List<BackupFile> list, C31114OooO c31114OooO, Continuation<? super C31128OooOOO0> continuation) {
        super(2, continuation);
        this.f111083OooOo = list;
        this.f111085OooOoO0 = c31114OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31128OooOOO0(this.f111083OooOo, this.f111085OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31128OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C31114OooO c31114OooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111084OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                List<BackupFile> list = this.f111083OooOo;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c31114OooO = this.f111085OooOoO0;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    BackupFile backupFile = (BackupFile) next;
                    if (C32501OooO0oO.OooO0o0(new File(backupFile.getPath())).equals("template") && ((Set) c31114OooO.f111043OooOo0O.getValue()).contains(backupFile.getId())) {
                        arrayList.add(next);
                    }
                }
                C27351Oooo0O0 c27351Oooo0O0 = c31114OooO.f111025OooO0Oo;
                this.f111084OooOo0o = 1;
                if (c27351Oooo0O0.OooOoO0(arrayList, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("BackupViewModel", "Couldn't recover notes from zip. " + C32460OooOooO.f116667OooO00o);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
