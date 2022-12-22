export interface AndroidTiktokEventsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
