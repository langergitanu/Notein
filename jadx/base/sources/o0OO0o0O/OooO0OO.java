package o0OO0o0O;

import com.orion.notein.data.p602db.entity.ColorSetEntity;
import com.orion.notein.domain.mapper.ColorSetMapper;
import com.orion.notein.domain.models.note.ColorSet;
import kotlin.coroutines.Continuation;
import o00OO0oO.C25003OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oo0oO0.InterfaceC34723Oooo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.colorset.ColorSetLocalDataSource$getColorSetByIdSync$2", m80623f = "ColorSetLocalDataSource.kt", m80624l = {24}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super ColorSet>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25003OooO0O0 f93465OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93466OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93467OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(C25003OooO0O0 c25003OooO0O0, String str, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f93465OooOo = c25003OooO0O0;
        this.f93467OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f93465OooOo, this.f93467OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super ColorSet> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93466OooOo0o;
        C25003OooO0O0 c25003OooO0O0 = this.f93465OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93466OooOo0o = 1;
            obj = ((InterfaceC34723Oooo) c25003OooO0O0.f84821OooO00o).OooO0OO(this.f93467OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        ColorSetEntity colorSetEntity = (ColorSetEntity) obj;
        if (colorSetEntity != null) {
            return ((ColorSetMapper) c25003OooO0O0.f84822OooO0O0).toModel(colorSetEntity);
        }
        return null;
    }
}
