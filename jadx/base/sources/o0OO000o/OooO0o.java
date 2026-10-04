package o0OO000o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.NoteContentDatabase;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.NoteContentDatabaseProvider$handleWithNoteContentDatabaseSync$2", m80623f = "NoteContentDatabaseProvider.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f90924OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26454OooO0Oo f90925OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f90926OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ReentrantReadWriteLock.ReadLock f90927OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C26454OooO0Oo f90928OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f90929OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f90930OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0o(C26454OooO0Oo c26454OooO0Oo, String str, InterfaceC32508OooOOOo<? super NoteContentDatabase, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f90928OooOoOO = c26454OooO0Oo;
        this.f90930OooOoo0 = str;
        this.f90929OooOoo = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f90928OooOoOO, this.f90930OooOoo0, this.f90929OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReentrantReadWriteLock.ReadLock readLock;
        C26454OooO0Oo c26454OooO0Oo;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90926OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26454OooO0Oo c26454OooO0Oo2 = this.f90928OooOoOO;
            ReentrantReadWriteLock reentrantReadWriteLock = c26454OooO0Oo2.f90923OooO0o0;
            String str2 = this.f90930OooOoo0;
            ?? r4 = this.f90929OooOoo;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            lock.lock();
            try {
                c26454OooO0Oo2.OooO0O0(str2);
                NoteContentDatabase noteContentDatabaseOooO0o = c26454OooO0Oo2.OooO0o(str2);
                this.f90925OooOo0o = c26454OooO0Oo2;
                this.f90924OooOo = str2;
                this.f90927OooOoO0 = lock;
                this.f90926OooOoO = 1;
                Object objInvoke = r4.invoke(noteContentDatabaseOooO0o, this);
                if (objInvoke == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26454OooO0Oo = c26454OooO0Oo2;
                obj = objInvoke;
                readLock = lock;
                str = str2;
            } catch (Throwable th) {
                th = th;
                readLock = lock;
                readLock.unlock();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            readLock = this.f90927OooOoO0;
            str = this.f90924OooOo;
            c26454OooO0Oo = this.f90925OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable th2) {
                th = th2;
                readLock.unlock();
                throw th;
            }
        }
        C26454OooO0Oo.OooO00o(c26454OooO0Oo, str);
        readLock.unlock();
        return obj;
    }
}
