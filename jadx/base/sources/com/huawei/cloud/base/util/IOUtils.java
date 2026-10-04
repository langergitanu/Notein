package com.huawei.cloud.base.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes8.dex */
public class IOUtils {
    private static final String TAG = "IOUtils";
    private static final Logger LOGGER = Logger.getLogger(TAG);

    public static long computeLength(StreamingContent streamingContent) throws IOException {
        ByteCountingOutputStream byteCountingOutputStream = new ByteCountingOutputStream();
        try {
            streamingContent.writeTo(byteCountingOutputStream);
            byteCountingOutputStream.close();
            return byteCountingOutputStream.count;
        } catch (Throwable th) {
            byteCountingOutputStream.close();
            throw th;
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        copy(inputStream, outputStream, true);
    }

    public static <S extends Serializable> S deserialize(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return (S) deserialize(new ByteArrayInputStream(bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isSymbolicLink(File file) throws Throwable {
        try {
            return ((Boolean) Class.forName("java.nio.file.Files").getMethod("isSymbolicLink", Path.class).invoke(null, File.class.getMethod("toPath", new Class[0]).invoke(file, new Object[0]))).booleanValue();
        } catch (ClassNotFoundException e) {
            LOGGER.m75688d(e.toString());
            if (File.separatorChar == '\\') {
                return false;
            }
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (IllegalAccessException e2) {
            LOGGER.m75688d(e2.toString());
            if (File.separatorChar == '\\') {
            }
        } catch (IllegalArgumentException e3) {
            LOGGER.m75688d(e3.toString());
            if (File.separatorChar == '\\') {
            }
        } catch (NoSuchMethodException e4) {
            LOGGER.m75688d(e4.toString());
            if (File.separatorChar == '\\') {
            }
        } catch (SecurityException e5) {
            LOGGER.m75688d(e5.toString());
            if (File.separatorChar == '\\') {
            }
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            Throwables.propagateIfPossible(cause, IOException.class);
            throw new IOException(cause);
        }
    }

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        serialize(obj, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        try {
            ByteStreams.copy(inputStream, outputStream);
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    public static <S extends Serializable> S deserialize(InputStream inputStream) throws IOException {
        try {
            try {
                return (S) new ObjectInputStream(inputStream).readObject();
            } catch (ClassNotFoundException e) {
                IOException iOException = new IOException("Failed to deserialize object");
                iOException.initCause(e);
                throw iOException;
            }
        } finally {
            inputStream.close();
        }
    }

    public static void serialize(Object obj, OutputStream outputStream) throws IOException {
        try {
            new ObjectOutputStream(outputStream).writeObject(obj);
        } finally {
            outputStream.close();
        }
    }
}
