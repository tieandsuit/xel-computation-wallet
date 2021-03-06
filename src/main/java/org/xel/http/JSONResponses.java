/*
 * Copyright © 2013-2016 The Nxt Core Developers.
 * Copyright © 2016-2017 Jelurida IP B.V.
 * Copyright © 2017 The XEL Core Developers.
 *
 * See the LICENSE.txt file at the top-level directory of this distribution
 * for licensing information.
 *
 * Unless otherwise agreed in a custom licensing agreement with Jelurida B.V.,
 * no part of the Nxt software, including this file, may be copied, modified,
 * propagated, or distributed except according to the terms contained in the
 * LICENSE.txt file.
 *
 * Removal or modification of this copyright notice is prohibited.
 *
 */

package org.xel.http;

import org.xel.Constants;
import org.xel.util.Convert;
import org.xel.util.JSON;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import java.util.Arrays;

public final class JSONResponses {

    /* ELASTIC SPECIFIC BEGIN */
    public static final JSONStreamAware MISSING_FIELDS_REDEEM = JSONResponses.missing("address or secp_signatures");
    /* ELASTIC SPECIFIC END */

    public static final JSONStreamAware MISSING_DEADLINE = missing("deadline");
    public static final JSONStreamAware INCORRECT_DEADLINE = incorrect("deadline");
    public static final JSONStreamAware MISSING_TRANSACTION_BYTES_OR_JSON = missing("transactionBytes", "transactionJSON");
    public static final JSONStreamAware MISSING_HALLMARK = missing("hallmark");
    public static final JSONStreamAware INCORRECT_HALLMARK = incorrect("hallmark");
    public static final JSONStreamAware MISSING_WEBSITE = missing("website");
    public static final JSONStreamAware INCORRECT_WEBSITE = incorrect("website");
    public static final JSONStreamAware MISSING_TOKEN = missing("token");
    public static final JSONStreamAware INCORRECT_TOKEN = incorrect("token");
    public static final JSONStreamAware MISSING_ACCOUNT = missing("account");
    public static final JSONStreamAware INCORRECT_ACCOUNT = incorrect("account");
    public static final JSONStreamAware INCORRECT_TIMESTAMP = incorrect("timestamp");
    public static final JSONStreamAware UNKNOWN_ACCOUNT = unknown("account");
    public static final JSONStreamAware UNKNOWN_BLOCK = unknown("block");
    public static final JSONStreamAware INCORRECT_BLOCK = incorrect("block");
    public static final JSONStreamAware UNKNOWN_ENTRY = unknown("entry");
    public static final JSONStreamAware MISSING_PEER = missing("peer");
    public static final JSONStreamAware UNKNOWN_PEER = unknown("peer");
    public static final JSONStreamAware MISSING_TRANSACTION = missing("transaction");
    public static final JSONStreamAware UNKNOWN_TRANSACTION = unknown("transaction");
    public static final JSONStreamAware INCORRECT_TRANSACTION = incorrect("transaction");
    public static final JSONStreamAware MISSING_NAME = missing("name");
    public static final JSONStreamAware MISSING_HOST = missing("host");
    public static final JSONStreamAware MISSING_DATE = missing("date");
    public static final JSONStreamAware MISSING_WEIGHT = missing("weight");
    public static final JSONStreamAware INCORRECT_HOST = incorrect("host", "(the length exceeds 100 chars limit)");
    public static final JSONStreamAware INCORRECT_WEIGHT = incorrect("weight");
    public static final JSONStreamAware INCORRECT_DATE = incorrect("date");
    public static final JSONStreamAware INCORRECT_RECIPIENT = incorrect("recipient");
    public static final JSONStreamAware INCORRECT_ARBITRARY_MESSAGE = incorrect("message");
    public static final JSONStreamAware MISSING_DESCRIPTION = missing("description");
    public static final JSONStreamAware INCORRECT_POLL_NAME_LENGTH = incorrect("name", "(length must be not longer than " + Constants.MAX_POLL_NAME_LENGTH + " characters)");
    public static final JSONStreamAware INCORRECT_POLL_DESCRIPTION_LENGTH = incorrect("description", "(length must be not longer than " + Constants.MAX_POLL_DESCRIPTION_LENGTH + " characters)");
    public static final JSONStreamAware INCORRECT_POLL_OPTION_LENGTH = incorrect("option", "(length must be not longer than " + Constants.MAX_POLL_OPTION_LENGTH + " characters)");
    public static final JSONStreamAware INCORRECT_ZEROOPTIONS = incorrect("option", "no options given");
    public static final JSONStreamAware INCORRECT_VOTE = incorrect("vote");
    public static final JSONStreamAware UNKNOWN_POLL = unknown("poll");
    public static final JSONStreamAware INCORRECT_WHITELIST = incorrect("whitelist");
    public static final JSONStreamAware INCORRECT_ACCOUNT_NAME_LENGTH = incorrect("name", "(length must be less than " + Constants.MAX_ACCOUNT_NAME_LENGTH + " characters)");
    public static final JSONStreamAware INCORRECT_ACCOUNT_DESCRIPTION_LENGTH = incorrect("description", "(length must be less than " + Constants.MAX_ACCOUNT_DESCRIPTION_LENGTH + " characters)");
    public static final JSONStreamAware MISSING_SIGNATURE_HASH = missing("signatureHash");
    public static final JSONStreamAware INCORRECT_HEIGHT = incorrect("height");
    public static final JSONStreamAware MISSING_HEIGHT = missing("height");
    public static final JSONStreamAware INCORRECT_MESSAGE_TO_ENCRYPT = incorrect("messageToEncrypt");
    public static final JSONStreamAware MISSING_MESSAGE_TO_ENCRYPT = missing("messageToEncrypt");
    public static final JSONStreamAware INCORRECT_ADMIN_PASSWORD = incorrect("adminPassword", "(the specified password does not match nxt.adminPassword)");
    public static final JSONStreamAware LOCKED_ADMIN_PASSWORD = incorrect("adminPassword", "(locked for 1 hour, too many incorrect password attempts)");
    public static final JSONStreamAware OVERFLOW = error("overflow");
    public static final JSONStreamAware RESPONSE_STREAM_ERROR = responseError("responseOutputStream");
    public static final JSONStreamAware RESPONSE_WRITE_ERROR = responseError("responseWrite");
    public static final JSONStreamAware MISSING_TRANSACTION_FULL_HASH = missing("transactionFullHash");
    public static final JSONStreamAware UNKNOWN_TRANSACTION_FULL_HASH = unknown("transactionFullHash");
    public static final JSONStreamAware INCORRECT_LINKED_FULL_HASH = incorrect("phasingLinkedFullHash");
    public static final JSONStreamAware INCORRECT_TAGGED_DATA_FILE = incorrect("data", "cannot read file data");
    public static final JSONStreamAware INCORRECT_FILE = incorrect("file", "cannot read file data");
    public static final JSONStreamAware MISSING_MESSAGE_ENCRYPTED_MESSAGE = missing("message", "encryptedMessageData");
    public static final JSONStreamAware EITHER_MESSAGE_ENCRYPTED_MESSAGE = either("message", "encryptedMessageData");
    public static final JSONStreamAware INCORRECT_HASH_ALGORITHM = incorrect("hashAlgorithm");
    public static final JSONStreamAware MISSING_SECRET = missing("secret");
    public static final JSONStreamAware INCORRECT_SECRET = incorrect("secret");
    public static final JSONStreamAware MISSING_RECIPIENT_PUBLIC_KEY = missing("recipientPublicKey");
    public static final JSONStreamAware MISSING_PROPERTY = missing("property");
    public static final JSONStreamAware INCORRECT_EC_BLOCK = incorrect("ecBlockId", "ecBlockId does not match the block id at ecBlockHeight");
    public static final JSONStreamAware NOT_ENOUGH_FUNDS;
    public static final JSONStreamAware MISSING_XEL_PER_POW = missing("correct xel per pow value");
    public static final JSONStreamAware MISSING_XEL_PER_BOUNTY = missing("correct xel per bounty value");
    public static final JSONStreamAware MISSING_BOUNTYLIMIT = missing("correct bounties per iteration value");
    public static final JSONStreamAware MISSING_ITERATIOS = missing("correct iteration count");
    public static final JSONStreamAware MISSING_CAPPOW = missing("correct limit of pow-submissions");
    public static final JSONStreamAware MISSING_PROGAMCODE = missing("program source code");

    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 6);
        response.put("errorDescription", "Not enough funds");
        NOT_ENOUGH_FUNDS = JSON.prepare(response);
    }

    public static final JSONStreamAware NOT_ENOUGH_ASSETS;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 6);
        response.put("errorDescription", "Not enough assets");
        NOT_ENOUGH_ASSETS = JSON.prepare(response);
    }

    public static final JSONStreamAware WORK_NOT_VALID;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 30000);
        response.put("errorDescription", "Work does not validate, are you sure your EPL code is correct?");
        WORK_NOT_VALID = JSON.prepare(response);
    }

    public static final JSONStreamAware WORK_CRASHED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 30001);
        response.put("errorDescription", "Your EPL code is not executing properly, please fix it!");
        WORK_CRASHED = JSON.prepare(response);
    }

    public static final JSONStreamAware ASSET_NOT_ISSUED_YET;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 6);
        response.put("errorDescription", "Asset not issued yet");
        ASSET_NOT_ISSUED_YET = JSON.prepare(response);
    }

    public static final JSONStreamAware NOT_ENOUGH_CURRENCY;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 6);
        response.put("errorDescription", "Not enough currency");
        NOT_ENOUGH_CURRENCY = JSON.prepare(response);
    }

    public static final JSONStreamAware ERROR_NOT_ALLOWED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 7);
        response.put("errorDescription", "Not allowed");
        ERROR_NOT_ALLOWED = JSON.prepare(response);
    }

    public static final JSONStreamAware ERROR_WORK_UNKNOWN;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 70001);
        response.put("errorDescription", "This work is either unknown or already closed");
        ERROR_WORK_UNKNOWN = JSON.prepare(response);
    }

    public static final JSONStreamAware ERROR_DISABLED;
    static {
        JSONObject response  = new JSONObject();
        response.put("errorCode", 16);
        response.put("errorDescription", "This API has been disabled");
        ERROR_DISABLED = JSON.prepare(response);
    }

    public static final JSONStreamAware ERROR_INCORRECT_REQUEST;
    static {
        JSONObject response  = new JSONObject();
        response.put("errorCode", 1);
        response.put("errorDescription", "Incorrect request");
        ERROR_INCORRECT_REQUEST = JSON.prepare(response);
    }

    public static final JSONStreamAware ERROR_WORK_INCORRECT;
    static {
        JSONObject response  = new JSONObject();
        response.put("errorCode", 6001);
        response.put("errorDescription", "The work is unknown or already closed. You do not want to submit any pow/bty anymore");
        ERROR_WORK_INCORRECT = JSON.prepare(response);
    }

    public static final JSONStreamAware EVERYTHING_ALRIGHT;
    static {
        JSONObject response  = new JSONObject();
        response.put("errorCode", 1001);
        response.put("errorDescription", "Transaction has been successfully submitted");
        EVERYTHING_ALRIGHT = JSON.prepare(response);
    }

    public static final JSONStreamAware NOT_FORGING;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 5);
        response.put("errorDescription", "Account is not forging");
        NOT_FORGING = JSON.prepare(response);
    }

    public static final JSONStreamAware POST_REQUIRED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 1);
        response.put("errorDescription", "This request is only accepted using POST!");
        POST_REQUIRED = JSON.prepare(response);
    }

    public static final JSONStreamAware FEATURE_NOT_AVAILABLE;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 9);
        response.put("errorDescription", "Feature not available");
        FEATURE_NOT_AVAILABLE = JSON.prepare(response);
    }

    public static final JSONStreamAware DECRYPTION_FAILED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Decryption failed");
        DECRYPTION_FAILED = JSON.prepare(response);
    }

    public static final JSONStreamAware ALREADY_DELIVERED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Purchase already delivered");
        ALREADY_DELIVERED = JSON.prepare(response);
    }

    public static final JSONStreamAware DUPLICATE_REFUND;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Refund already sent");
        DUPLICATE_REFUND = JSON.prepare(response);
    }

    public static final JSONStreamAware GOODS_NOT_DELIVERED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Goods have not been delivered yet");
        GOODS_NOT_DELIVERED = JSON.prepare(response);
    }

    public static final JSONStreamAware NO_MESSAGE;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "No attached message found");
        NO_MESSAGE = JSON.prepare(response);
    }

    public static final JSONStreamAware HEIGHT_NOT_AVAILABLE;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Requested height not available");
        HEIGHT_NOT_AVAILABLE = JSON.prepare(response);
    }

    public static final JSONStreamAware CANNOT_DELETE_CURRENCY;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Currency cannot be deleted");
        CANNOT_DELETE_CURRENCY = JSON.prepare(response);
    }

    public static final JSONStreamAware NO_PASSWORD_IN_CONFIG;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Administrator's password is not configured. Please set nxt.adminPassword");
        NO_PASSWORD_IN_CONFIG = JSON.prepare(response);
    }

    public static final JSONStreamAware POLL_RESULTS_NOT_AVAILABLE;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Poll results no longer available, set nxt.processPolls=true and rescan");
        POLL_RESULTS_NOT_AVAILABLE = JSON.prepare(response);
    }

    public static final JSONStreamAware POLL_FINISHED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Poll has already finished");
        POLL_FINISHED = JSON.prepare(response);
    }

    public static final JSONStreamAware PHASING_TRANSACTION_FINISHED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 8);
        response.put("errorDescription", "Phasing transaction has already finished");
        PHASING_TRANSACTION_FINISHED = JSON.prepare(response);
    }

    public static final JSONStreamAware TOO_MANY_PHASING_VOTES;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 10);
        response.put("errorDescription", "Can vote for at most " + Constants.MAX_PHASING_VOTE_TRANSACTIONS + " phased transactions at once");
        TOO_MANY_PHASING_VOTES = JSON.prepare(response);
    }

    public static final JSONStreamAware HASHES_MISMATCH;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 10);
        response.put("errorDescription", "Hashes don't match. You should notify Jeff Garzik.");
        HASHES_MISMATCH = JSON.prepare(response);
    }

    public static final JSONStreamAware REQUIRED_BLOCK_NOT_FOUND;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 13);
        response.put("errorDescription", "Required block not found in the blockchain");
        REQUIRED_BLOCK_NOT_FOUND = JSON.prepare(response);
    }

    public static final JSONStreamAware REQUIRED_LAST_BLOCK_NOT_FOUND;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 14);
        response.put("errorDescription", "Current last block is different");
        REQUIRED_LAST_BLOCK_NOT_FOUND = JSON.prepare(response);
    }

    public static final JSONStreamAware MISSING_SECRET_PHRASE;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 3);
        response.put("errorDescription", "secretPhrase not specified or not submitted to the remote node");
        MISSING_SECRET_PHRASE = JSON.prepare(response);
    }

    public static final JSONStreamAware PRUNED_TRANSACTION;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 15);
        response.put("errorDescription", "Pruned transaction data not currently available from any peer");
        PRUNED_TRANSACTION = JSON.prepare(response);
    }

    public static final JSONStreamAware PROXY_MISSING_REQUEST_TYPE;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 17);
        response.put("errorDescription", "Proxy servlet needs requestType parameter in the URL query");
        PROXY_MISSING_REQUEST_TYPE = JSON.prepare(response);
    }

    public static final JSONStreamAware PROXY_SECRET_DATA_DETECTED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 18);
        response.put("errorDescription", "Proxied requests contains secret parameters");
        PROXY_SECRET_DATA_DETECTED = JSON.prepare(response);
    }

    public static final JSONStreamAware API_PROXY_NO_OPEN_API_PEERS;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 19);
        response.put("errorDescription", "No openAPI peers found");
        API_PROXY_NO_OPEN_API_PEERS = JSON.prepare(response);
    }

    public static final JSONStreamAware LIGHT_CLIENT_DISABLED_API;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 20);
        response.put("errorDescription", "This API is disabled when running as light client");
        LIGHT_CLIENT_DISABLED_API = JSON.prepare(response);
    }

    public static final JSONStreamAware PEER_NOT_CONNECTED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 5);
        response.put("errorDescription", "Peer not connected");
        PEER_NOT_CONNECTED = JSON.prepare(response);
    }

    public static final JSONStreamAware PEER_NOT_OPEN_API;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 5);
        response.put("errorDescription", "Peer is not providing open API");
        PEER_NOT_OPEN_API = JSON.prepare(response);
    }

    static JSONStreamAware missing(String... paramNames) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 3);
        if (paramNames.length == 1) {
            response.put("errorDescription", "\"" + paramNames[0] + "\"" + " not specified");
        } else {
            response.put("errorDescription", "At least one of " + Arrays.toString(paramNames) + " must be specified");
        }
        return JSON.prepare(response);
    }

    static JSONStreamAware either(String... paramNames) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 6);
        response.put("errorDescription", "Not more than one of " + Arrays.toString(paramNames) + " can be specified");
        return JSON.prepare(response);
    }

    static JSONStreamAware incorrect(String paramName) {
        return incorrect(paramName, null);
    }

    static JSONStreamAware incorrect(String paramName, String details) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 4);
        response.put("errorDescription", "Incorrect \"" + paramName + (details != null ? "\" " + details : "\""));
        return JSON.prepare(response);
    }

    static JSONStreamAware unknown(String objectName) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 5);
        response.put("errorDescription", "Unknown " + objectName);
        return JSON.prepare(response);
    }

    static JSONStreamAware WORK_SCREWED(String screwedUpReason) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 50000);
        response.put("errorDescription", "Work error: " + screwedUpReason);
        return JSON.prepare(response);
    }

    static JSONStreamAware unknownAccount(long id) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 5);
        response.put("errorDescription", "Unknown account");
        response.put("account", Long.toUnsignedString(id));
        response.put("accountRS", Convert.rsAccount(id));
        return JSON.prepare(response);
    }

    static JSONStreamAware fileNotFound(String objectName) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 10);
        response.put("errorDescription", "File not found " + objectName);
        return JSON.prepare(response);
    }

    static JSONStreamAware error(String error) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 11);
        response.put("errorDescription", error);
        return JSON.prepare(response);
    }

    private static JSONStreamAware responseError(String error) {
        JSONObject response = new JSONObject();
        response.put("errorCode", 12);
        response.put("errorDescription", error);
        return JSON.prepare(response);
    }


    public static final JSONStreamAware MONITOR_ALREADY_STARTED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 5);
        response.put("errorDescription", "Account monitor already started");
        MONITOR_ALREADY_STARTED = JSON.prepare(response);
    }

    public static final JSONStreamAware MONITOR_NOT_STARTED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 5);
        response.put("errorDescription", "Account monitor not started");
        MONITOR_NOT_STARTED = JSON.prepare(response);
    }

    private JSONResponses() {} // never

    public static final JSONStreamAware FAUCET_DISABLED;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 10000);
        response.put("errorDescription", "The faucet is disabled on this node");
        FAUCET_DISABLED = JSON.prepare(response);
    }
    public static final JSONStreamAware FAUCET_EMPTY;
    static {
        JSONObject response = new JSONObject();
        response.put("errorCode", 10001);
        response.put("errorDescription", "Faucet is empty, please wait until it gets topped up");
        FAUCET_EMPTY = JSON.prepare(response);
    }

    public static JSONStreamAware faucetThanks(String error) {
        JSONObject response = new JSONObject();
        response.put("successMessage", "Thanks for using our faucet! " + error + " XEL are heading your way, have fun!");
        return JSON.prepare(response);
    }

    public static JSONStreamAware faucetWait(String error) {
        JSONObject response = new JSONObject();
        response.put("successMessage", "Sorry, but you can use the faucet only once every " + error + " seconds");
        return JSON.prepare(response);
    }
}
