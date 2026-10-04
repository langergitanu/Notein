package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.appcompat.widget.C21559Oooo0oO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO extends AbstractC22259OooOO0o<InputStream> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final UriMatcher f67218OooOoO;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f67218OooOoO = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // com.bumptech.glide.load.data.AbstractC22259OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f67218OooOoO.match(uri);
        if (iMatch == 1) {
            Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch != 5) {
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return inputStreamOpenContactPhotoInputStream;
        }
        throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "InputStream is null for "));
    }

    @Override // com.bumptech.glide.load.data.AbstractC22259OooOO0o
    public final void OooO0o0(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}
