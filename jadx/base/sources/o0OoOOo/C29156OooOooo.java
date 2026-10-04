package o0OoOOo;

import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOOo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$notifySingleTapEventForTapReading$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1322, 1337}, m80625m = "invokeSuspend")
public final class C29156OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f103342OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f103343OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103344OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f103345OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f103346OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29156OooOooo(ArrayList arrayList, com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, Continuation continuation) {
        super(2, continuation);
        this.f103345OooOoO0 = arrayList;
        this.f103344OooOoO = oooO0o;
        this.f103346OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29156OooOooo(this.f103345OooOoO0, this.f103344OooOoO, this.f103346OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29156OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        AudioSyncRecord audioSyncRecord;
        AudioSyncRecord audioSyncRecord2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103342OooOo;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103344OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = this.f103345OooOoO0;
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((InterfaceC31284OooO0O0) obj2).getId(), obj2);
            }
            Set setKeySet = linkedHashMap.keySet();
            this.f103343OooOo0o = linkedHashMap;
            this.f103342OooOo = 1;
            obj = oooO0o.f74223OooO0o.f97084OooO00o.OooOO0o(this.f103346OooOoOO, setKeySet, this);
            if (obj != enumC32485OooO00o) {
                map = linkedHashMap;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            audioSyncRecord2 = (AudioSyncRecord) this.f103343OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            audioSyncRecord = audioSyncRecord2;
            int audioPosition = audioSyncRecord.getAudioPosition() - 100;
            oooO0o.Oooo000(new Integer(audioPosition >= 0 ? audioPosition : 0), audioSyncRecord.getAudioId());
            return C32460OooOooO.f116667OooO00o;
        }
        map = (Map) this.f103343OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) obj;
        if (list.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o.OooO0o0("notifyAudioGloveSingleTapEvent. audioSyncRecords is empty", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long creationTime = ((AudioSyncRecord) next).getCreationTime();
            do {
                Object next2 = it.next();
                long creationTime2 = ((AudioSyncRecord) next2).getCreationTime();
                if (creationTime < creationTime2) {
                    next = next2;
                    creationTime = creationTime2;
                }
            } while (it.hasNext());
        }
        audioSyncRecord = (AudioSyncRecord) next;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) map.get(audioSyncRecord.getDisplayItemId());
        if (interfaceC31284OooO0O0 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        if ((interfaceC31284OooO0O0 instanceof DrawRecord) && ((DrawRecord) interfaceC31284OooO0O0).isTapeTransparent()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o2.OooO0o0("notifyAudioGloveSingleTapEvent. selectedItem is transparent", new Object[0]);
        } else {
            if (!(interfaceC31284OooO0O0 instanceof ShapeInfo) || !((ShapeInfo) interfaceC31284OooO0O0).isTapeTransparent()) {
                C33772OooooOo c33772OooooOo = oooO0o.f74253Oooo00o;
                this.f103343OooOo0o = audioSyncRecord;
                this.f103342OooOo = 2;
                if (c33772OooooOo.emit(interfaceC31284OooO0O0, this) != enumC32485OooO00o) {
                    audioSyncRecord2 = audioSyncRecord;
                    audioSyncRecord = audioSyncRecord2;
                }
                return enumC32485OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("MediaToolbarViewModel");
            c20358OooO00o3.OooO0o0("notifyAudioGloveSingleTapEvent. selectedItem is transparent", new Object[0]);
        }
        int audioPosition2 = audioSyncRecord.getAudioPosition() - 100;
        oooO0o.Oooo000(new Integer(audioPosition2 >= 0 ? audioPosition2 : 0), audioSyncRecord.getAudioId());
        return C32460OooOooO.f116667OooO00o;
    }
}
