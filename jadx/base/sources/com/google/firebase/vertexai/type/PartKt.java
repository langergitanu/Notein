package com.google.firebase.vertexai.type;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.firebase.vertexai.type.FileDataPart;
import com.google.firebase.vertexai.type.FunctionCallPart;
import com.google.firebase.vertexai.type.FunctionResponsePart;
import com.google.firebase.vertexai.type.InlineDataPart;
import com.google.firebase.vertexai.type.TextPart;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.Oooo0;
import oOo00O0O.C34471OooOoO0;
import oOo00O0O.OooOO0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u000b\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000b\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\b*\u00020\u000b\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u000bH\u0000\u001a\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0011H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000*\f\b\u0000\u0010\u0013\"\u00020\b2\u00020\b¨\u0006\u0014"}, m80612d2 = {"BASE_64_FLAGS", "", "decodeBitmapFromImage", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "input", "", "encodeBitmapToBase64Png", "", "asFileDataOrNull", "Lcom/google/firebase/vertexai/type/FileDataPart;", "Lcom/google/firebase/vertexai/type/Part;", "asImageOrNull", "asInlineDataPartOrNull", "Lcom/google/firebase/vertexai/type/InlineDataPart;", "asTextOrNull", "toInternal", "Lcom/google/firebase/vertexai/type/InternalPart;", "toPublic", "Base64", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PartKt {
    public static final int BASE_64_FLAGS = 2;

    public static final FileDataPart asFileDataOrNull(Part part) {
        OooOOO0.OooO0oO(part, "<this>");
        if (part instanceof FileDataPart) {
            return (FileDataPart) part;
        }
        return null;
    }

    public static final Bitmap asImageOrNull(Part part) {
        OooOOO0.OooO0oO(part, "<this>");
        ImagePart imagePart = part instanceof ImagePart ? (ImagePart) part : null;
        if (imagePart != null) {
            return imagePart.getImage();
        }
        return null;
    }

    public static final InlineDataPart asInlineDataPartOrNull(Part part) {
        OooOOO0.OooO0oO(part, "<this>");
        if (part instanceof InlineDataPart) {
            return (InlineDataPart) part;
        }
        return null;
    }

    public static final String asTextOrNull(Part part) {
        OooOOO0.OooO0oO(part, "<this>");
        TextPart textPart = part instanceof TextPart ? (TextPart) part : null;
        if (textPart != null) {
            return textPart.getText();
        }
        return null;
    }

    private static final Bitmap decodeBitmapFromImage(byte[] bArr) {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    private static final String encodeBitmapToBase64Png(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        OooOOO0.OooO0o(strEncodeToString, "encodeToString(it.toByteArray(), BASE_64_FLAGS)");
        return strEncodeToString;
    }

    public static final InternalPart toInternal(Part part) {
        OooOOO0.OooO0oO(part, "<this>");
        if (part instanceof TextPart) {
            return new TextPart.Internal(((TextPart) part).getText());
        }
        if (part instanceof ImagePart) {
            return new InlineDataPart.Internal(new InlineDataPart.Internal.InlineData("image/jpeg", encodeBitmapToBase64Png(((ImagePart) part).getImage())));
        }
        if (part instanceof InlineDataPart) {
            InlineDataPart inlineDataPart = (InlineDataPart) part;
            String mimeType = inlineDataPart.getMimeType();
            String strEncodeToString = Base64.encodeToString(inlineDataPart.getInlineData(), 2);
            OooOOO0.OooO0o(strEncodeToString, "encodeToString(inlineData, BASE_64_FLAGS)");
            return new InlineDataPart.Internal(new InlineDataPart.Internal.InlineData(mimeType, strEncodeToString));
        }
        if (part instanceof FunctionCallPart) {
            FunctionCallPart functionCallPart = (FunctionCallPart) part;
            return new FunctionCallPart.Internal(new FunctionCallPart.Internal.FunctionCall(functionCallPart.getName(), functionCallPart.getArgs()));
        }
        if (part instanceof FunctionResponsePart) {
            FunctionResponsePart functionResponsePart = (FunctionResponsePart) part;
            return new FunctionResponsePart.Internal(new FunctionResponsePart.Internal.FunctionResponse(functionResponsePart.getName(), functionResponsePart.getResponse()));
        }
        if (part instanceof FileDataPart) {
            FileDataPart fileDataPart = (FileDataPart) part;
            return new FileDataPart.Internal(new FileDataPart.Internal.FileData(fileDataPart.getMimeType(), fileDataPart.getUri()));
        }
        throw new SerializationException("The given subclass of Part (" + part.getClass().getSimpleName() + ") is not supported in the serialization yet.", null, 2, null);
    }

    public static final Part toPublic(InternalPart internalPart) {
        OooOOO0.OooO0oO(internalPart, "<this>");
        if (internalPart instanceof TextPart.Internal) {
            return new TextPart(((TextPart.Internal) internalPart).getText());
        }
        if (internalPart instanceof InlineDataPart.Internal) {
            InlineDataPart.Internal internal = (InlineDataPart.Internal) internalPart;
            byte[] data = Base64.decode(internal.getInlineData().getData(), 2);
            if (!C33599OooOo0O.OooOoOO(internal.getInlineData().getMimeType(), "image", false)) {
                OooOOO0.OooO0o(data, "data");
                return new InlineDataPart(data, internal.getInlineData().getMimeType());
            }
            OooOOO0.OooO0o(data, "data");
            Bitmap bitmapDecodeBitmapFromImage = decodeBitmapFromImage(data);
            OooOOO0.OooO0o(bitmapDecodeBitmapFromImage, "decodeBitmapFromImage(data)");
            return new ImagePart(bitmapDecodeBitmapFromImage);
        }
        if (!(internalPart instanceof FunctionCallPart.Internal)) {
            if (internalPart instanceof FunctionResponsePart.Internal) {
                FunctionResponsePart.Internal internal2 = (FunctionResponsePart.Internal) internalPart;
                return new FunctionResponsePart(internal2.getFunctionResponse().getName(), internal2.getFunctionResponse().getResponse());
            }
            if (internalPart instanceof FileDataPart.Internal) {
                FileDataPart.Internal internal3 = (FileDataPart.Internal) internalPart;
                return new FileDataPart(internal3.getFileData().getMimeType(), internal3.getFileData().getFileUri());
            }
            throw new SerializationException("Unsupported part type \"" + internalPart.getClass().getSimpleName() + "\" provided. This model may not be supported by this SDK.", null, 2, null);
        }
        FunctionCallPart.Internal internal4 = (FunctionCallPart.Internal) internalPart;
        String name = internal4.getFunctionCall().getName();
        Map<String, OooOO0O> args = internal4.getFunctionCall().getArgs();
        if (args == null) {
            args = C34436OooOoOO.f123455OooOo0o;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Oooo0.OooO0Oo(args.size()));
        Iterator<T> it = args.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object obj = (OooOO0O) entry.getValue();
            if (obj == null) {
                obj = C34471OooOoO0.INSTANCE;
            }
            linkedHashMap.put(key, obj);
        }
        return new FunctionCallPart(name, linkedHashMap);
    }
}
