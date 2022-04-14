import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";

const initialState = {
  message: [],
  messageStatus: "idle",
  messageError: null,
};

export const MessageService = async (params) => {
  const {httpClient, user} = params;
  const response = await httpClient.get(`localhost:8080/message/${user}`);
  return response.data;
};

export const sendMessageService = createAsyncThunk(
  "combinations/addNewCombination",
  MessageService
);