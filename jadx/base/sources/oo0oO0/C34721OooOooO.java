package oo0oO0;

import com.orion.notein.data.p602db.entity.AudioFileEntity;
import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import com.orion.notein.data.p602db.entity.UserEntity;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34721OooOooO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125038OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125039OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object[] f125040OooOoO0;

    public /* synthetic */ C34721OooOooO(Object obj, Object[] objArr, int i) {
        this.f125039OooOo0o = i;
        this.f125038OooOo = obj;
        this.f125040OooOoO0 = objArr;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        InterfaceC24747OooO0O0 interfaceC24747OooO0O0 = (InterfaceC24747OooO0O0) obj;
        switch (this.f125039OooOo0o) {
            case 0:
                ((C34731Oooo0oo) this.f125038OooOo).f125059OooO0oO.OoooOOO(interfaceC24747OooO0O0, (AudioFileEntity[]) this.f125040OooOoO0);
                break;
            case 1:
                ((o00OOOOo) this.f125038OooOo).f125341OooO0Oo.OoooOOO(interfaceC24747OooO0O0, (NotePlaceholderEntity[]) this.f125040OooOoO0);
                break;
            default:
                ((C34987o0O0O0o) this.f125038OooOo).f125632OooO0O0.OooOoo0(interfaceC24747OooO0O0, (UserEntity[]) this.f125040OooOoO0);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
