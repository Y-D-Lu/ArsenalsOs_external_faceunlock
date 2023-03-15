package cn.arsenals.os.faceunlock.vendor.utils;

public interface UnlockEncryptor {
    byte[] decrypt(byte[] bArr);

    byte[] encrypt(byte[] bArr);
}
