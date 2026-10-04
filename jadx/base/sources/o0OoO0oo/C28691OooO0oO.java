package o0OoO0oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import o0oo000O.C31182OooO;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.ContentUriConvertor$saveImageToPrivate$2", m80623f = "ContentUriConvertor.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28691OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f101650OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f101651OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28691OooO0oO(Context context, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f101651OooOo0o = context;
        this.f101650OooOo = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28691OooO0oO(this.f101651OooOo0o, this.f101650OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C28691OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        InputStream inputStreamOpenInputStream;
        String strConcat;
        Uri uri = this.f101650OooOo;
        Context context = this.f101651OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            File fileOooO00o = C28692OooO0oo.OooO00o(C28692OooO0oo.OooO0O0(context), C28692OooO0oo.OooO0OO(context, uri));
            if (fileOooO00o == null || (inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri)) == null) {
                return null;
            }
            try {
                int iOooO00o = C31182OooO.OooO00o(context, uri);
                if (iOooO00o == 0) {
                    C31190OooO0oo.OooO0O0(context, uri, fileOooO00o);
                    String absolutePath = fileOooO00o.getAbsolutePath();
                    inputStreamOpenInputStream.close();
                    return absolutePath;
                }
                Bitmap bitmapOooO0O0 = C31182OooO.OooO0O0(iOooO00o, BitmapFactory.decodeStream(inputStreamOpenInputStream));
                if (C32501OooO0oO.OooO0o0(fileOooO00o).equalsIgnoreCase("png")) {
                    strConcat = fileOooO00o.getAbsolutePath();
                } else {
                    String absolutePath2 = fileOooO00o.getAbsolutePath();
                    kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                    strConcat = C33599OooOo0O.OooooOO(absolutePath2, ".", absolutePath2).concat(".png");
                }
                C31182OooO.OooO0OO(bitmapOooO0O0, C31190OooO0oo.OooOOO0(strConcat), Bitmap.CompressFormat.PNG, 100);
                inputStreamOpenInputStream.close();
                return strConcat;
            } finally {
            }
        } catch (FileNotFoundException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ContentUriConvertor");
            c20358OooO00o.OooO0OO("copyFileFromUri: FileNotFoundException: %s", e.getMessage());
            return null;
        } catch (IOException e2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("ContentUriConvertor");
            c20358OooO00o2.OooO0OO("copyFileFromUri: IOException: %s", e2.getMessage());
            return null;
        } catch (SecurityException e3) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ContentUriConvertor");
            c20358OooO00o3.OooO0OO("copyFileFromUri: SecurityException: %s", e3.getMessage());
            return null;
        }
    }
}
