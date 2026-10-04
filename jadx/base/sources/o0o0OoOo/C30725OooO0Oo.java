package o0o0OoOo;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: o0o0OoOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$exportStorageReport$result$1", m80623f = "DebugViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30725OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f109895OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109896OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30725OooO0Oo(C30722OooO00o c30722OooO00o, Uri uri, Continuation<? super C30725OooO0Oo> continuation) {
        super(2, continuation);
        this.f109896OooOo0o = c30722OooO00o;
        this.f109895OooOo = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30725OooO0Oo(this.f109896OooOo0o, this.f109895OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30725OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C30722OooO00o c30722OooO00o = this.f109896OooOo0o;
        Context context = c30722OooO00o.f109859OooO0Oo;
        Context context2 = c30722OooO00o.f109859OooO0Oo;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.f109895OooOo;
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        if (outputStreamOpenOutputStream == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DebugViewModel");
            c20358OooO00o.OooO0OO("Failed to open OutputStream for Uri: " + uri, new Object[0]);
            return Boolean.FALSE;
        }
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            xmlSerializerNewSerializer.setOutput(outputStreamOpenOutputStream, "UTF-8");
            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
            xmlSerializerNewSerializer.startTag("", "files");
            File dataDir = context2.getDataDir();
            kotlin.jvm.internal.OooOOO0.OooO0o(dataDir, "getDataDir(...)");
            C30722OooO00o.OooO0oO(xmlSerializerNewSerializer, dataDir);
            File[] externalFilesDirs = context2.getExternalFilesDirs(null);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(externalFilesDirs);
            for (File file : externalFilesDirs) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(file);
                C30722OooO00o.OooO0oO(xmlSerializerNewSerializer, file);
            }
            xmlSerializerNewSerializer.endTag("", "files");
            xmlSerializerNewSerializer.endDocument();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            outputStreamOpenOutputStream.close();
            return Boolean.TRUE;
        } finally {
        }
    }
}
