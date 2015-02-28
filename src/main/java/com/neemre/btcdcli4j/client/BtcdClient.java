package com.neemre.btcdcli4j.client;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.neemre.btcdcli4j.domain.Info;
import com.neemre.btcdcli4j.domain.MemPoolInfo;
import com.neemre.btcdcli4j.domain.MiningInfo;
import com.neemre.btcdcli4j.domain.PeerNode;
import com.neemre.btcdcli4j.domain.WalletInfo;

public interface BtcdClient {
	
	void backupWallet(String filePath);
	
	String encryptWallet(String passphrase);

	String getAccount(String address);
	
	String getAccountAddress(String account);
	
	List<String> getAddressesByAccount(String account);
	
	BigDecimal getBalance();
	
	BigDecimal getBalance(String account);
	
	BigDecimal getBalance(String account, Integer confirmations);

	BigDecimal getBalance(String account, Integer confirmations, Boolean withWatchOnly);
	
	String getBestBlockHash();
	
	Integer getBlockCount();
	
	String getBlockHash(Integer blockHeight);
	
	BigDecimal getDifficulty();
	
	Boolean getGenerate();
	
	Long getHashesPerSec();
	
	Info getInfo();
	
	MemPoolInfo getMemPoolInfo();
	
	MiningInfo getMiningInfo();

	String getNewAddress();
	
	String getNewAddress(String account);
	
	List<PeerNode> getPeerInfo();
	
	String getRawChangeAddress();
	
	BigDecimal getReceivedByAccount(String account);

	BigDecimal getReceivedByAccount(String account, Integer confirmations);

	BigDecimal getReceivedByAddress(String address);

	BigDecimal getReceivedByAddress(String address, Integer confirmations);
	
	BigDecimal getUnconfirmedBalance();
	
	WalletInfo getWalletInfo();
	
	String importAddress(String address);
	
	String importAddress(String address, String account);

	String importAddress(String address, String account, boolean withRescan);
	
	String importPrivKey(String privateKey);

	String importPrivKey(String privateKey, String account);

	String importPrivKey(String privateKey, String account, boolean withRescan);
	
	String keyPoolRefill();

	String keyPoolRefill(int keypoolSize);
	
	Map<String, BigDecimal> listAccounts();
	
	Map<String, BigDecimal> listAccounts(Integer confirmations);
	
	Map<String, BigDecimal> listAccounts(Integer confirmations, Boolean withWatchOnly);
	
	String setAccount(String address, String account);
	
	void setGenerate(Boolean isGenerate);
	
	void setGenerate(Boolean isGenerate, Integer processors);
	
	Boolean setTxFee(BigDecimal txFee);
	
	String stop();
		
	void walletLock();

	void walletPassphrase(String passphrase, Integer authTimeout);

	void walletPassphraseChange(String curPassphrase, String newPassphrase);
}