package io.ktor.client.engine.cio;

import androidx.core.location.LocationRequestCompat;
import com.aspose.words.StyleIdentifier;
import io.ktor.utils.p616io.C23988OooooOO;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.Oooo0;
import io.ktor.utils.p616io.o0OO00O;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.UtilsKt$withoutClosePropagation$2", m80623f = "utils.kt", m80624l = {StyleIdentifier.TABLE_GRID_LIGHT}, m80625m = "invokeSuspend")
public final class C23941OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o0OO00O, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80461OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80462OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f80463OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23941OooOo0O(Oooo0 oooo0, Continuation continuation) {
        super(2, continuation);
        this.f80463OooOoO0 = oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C23941OooOo0O c23941OooOo0O = new C23941OooOo0O(this.f80463OooOoO0, continuation);
        c23941OooOo0O.f80461OooOo = obj;
        return c23941OooOo0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o0OO00O o0oo00o2, Continuation<? super C32460OooOooO> continuation) {
        return ((C23941OooOo0O) create(o0oo00o2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80462OooOo0o;
        Oooo0 oooo0 = this.f80463OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC23986Ooooo0o channel = ((o0OO00O) this.f80461OooOo).getChannel();
            this.f80462OooOo0o = 1;
            if (C23988OooooOO.OooO0O0(channel, oooo0, LocationRequestCompat.PASSIVE_INTERVAL, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        oooo0.OoooO00(1);
        return C32460OooOooO.f116667OooO00o;
    }
}
